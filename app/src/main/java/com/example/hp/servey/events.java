package com.example.hp.servey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.hp.servey.Api.APIManager;
import com.example.hp.servey.Api.ApiCalls;
import com.example.hp.servey.Api.Model.DataItem;
import com.example.hp.servey.Api.Model.EventResponse;
import com.example.hp.servey.Api.Model.LoginResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class events extends AppCompatActivity {
  RecyclerView recyclerView;
  RecyclerView.LayoutManager layoutManager;
  EventAdapter adapter;
  public int moderator_id=1;
  String password="";
  ArrayList<DataItem> dataItems;
   String entities_id="32";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_events);
      //  String user_name=getIntent().getStringExtra("user_name");
        password=getIntent().getStringExtra("password");
        moderator_id=getIntent().getIntExtra("id",1);
        //entities_id=getIntent().getStringExtra("entities_id");
        recyclerView=findViewById(R.id.recyle_view);
        layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        adapter=new EventAdapter(dataItems);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        APIManager.getAPIs().getEvent(moderator_id,password).enqueue(new Callback<EventResponse>() {
            @Override
            public void onResponse(Call<EventResponse> call, Response<EventResponse> response) {
                if(response.isSuccessful()){
                    if(response.body().getStatus().equals("success")) {
                        adapter.ChangeData(response.body().getData());
                              entities_id= String.valueOf(response.body().getData().get(0).getId());
                       // Toast.makeText(events.this, "load", Toast.LENGTH_LONG).show();
                    }

                   /* Intent intent=new Intent(events.this,FullyDescription.class);
                    intent.putExtra("m_id",id);
                    intent.putExtra("entities_id",entities_id);
                    intent.putExtra("password",password);
                    startActivity(intent);
                    */
                }else{
                    Toast.makeText(events.this, "Fail", Toast.LENGTH_LONG).show();

                }
            }

            @Override
            public void onFailure(Call<EventResponse> call, Throwable t) {
                Toast.makeText(events.this,t.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
            }

        });
        adapter.setOnItemClickListener(new EventAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int pos, int id) {
                Intent intent=new Intent(events.this,FullyDescription.class);
                intent.putExtra("m_id",moderator_id);
               intent.putExtra("entities_id",entities_id);
              // intent.putExtra("entities_id",entities_id);
                intent.putExtra("password",password);
                startActivity(intent);
            }
        });
    }



}
