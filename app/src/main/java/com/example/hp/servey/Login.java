package com.example.hp.servey;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hp.servey.Api.APIManager;
import com.example.hp.servey.Api.Model.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {
    private static final String TAG ="Success" ;
    EditText username, password;
    Button button;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        username = findViewById(R.id.edit1);
        password = findViewById(R.id.edit2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Start" , Toast.LENGTH_LONG).show();
                APIManager.getAPIs().getData(username.getText().toString(), password.getText().toString()).enqueue(new Callback<LoginResponse>() {
                        @Override
                        public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                                if(response.isSuccessful()){
                            if (response.body().getStatus().equals("success")) {
                                Toast.makeText(Login.this, "success", Toast.LENGTH_LONG).show();
                                    response.body().getData().setPassword(password.getText().toString());
                                    Intent intent=new Intent(Login.this,events.class);
                                    //intent.putExtra("user_name",r);
                                    intent.putExtra("user_name",response.body().getData().getUserName());
                                    //intent.putExtra("entities_id",response.body().getData().getVendorId());
                                intent.putExtra("password",response.body().getData().getPassword());
                                intent.putExtra("id",response.body().getData().getId());
                               // intent.putExtra("entities_id",response.body().getData().getVendorId());
                                startActivity(intent);


                            }}else {
                                    Toast.makeText(Login.this, "fail", Toast.LENGTH_LONG).show();

                                }

                        }
                        @Override
                        public void onFailure(Call<LoginResponse> call, Throwable t) {
                            Log.e(TAG,t.getLocalizedMessage() );
                            Toast.makeText(Login.this, "Fail", Toast.LENGTH_LONG).show();

                        }
                    });


                }


        });
    }
}



