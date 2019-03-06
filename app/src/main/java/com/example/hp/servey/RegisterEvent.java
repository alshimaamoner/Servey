package com.example.hp.servey;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.servey.Api.APIManager;
import com.example.hp.servey.Api.Model.RegistrationResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterEvent extends AppCompatActivity {

    protected TextView survey;
    protected EditText name;
    protected TextInputLayout inputName;
    protected EditText input_Phone;
    protected TextInputLayout inputPhone;
    protected Spinner gender;
    protected Button next;
    int moderator_id;
    String entity_id = "";
    String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_register_event);

        moderator_id = getIntent().getIntExtra("m_id", 1);
        entity_id = getIntent().getStringExtra("entities_id");
        password = getIntent().getStringExtra("password");
        initView();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                APIManager.getAPIs().getRegestration(moderator_id, password, inputName.getEditText().getText().toString(), inputPhone.getEditText().getText().toString(), entity_id, gender.getSelectedItem().toString()).enqueue(new Callback<RegistrationResponse>() {
                    @Override
                    public void onResponse(Call<RegistrationResponse> call, Response<RegistrationResponse> response) {
                        if (response.isSuccessful()) {
                            if (response.body().getStatus().equals("success")) {
                                Intent i = new Intent(RegisterEvent.this, detailes_of_survey.class);
                                i.putExtra("m_id", moderator_id);
                                // i.putExtra("entity_id",entity_id);
                                i.putExtra("entity_id", response.body().getData().getId());
                                i.putExtra("password", password);
                                startActivity(i);
                            } else {
                                Toast.makeText(RegisterEvent.this, "Fail Load", Toast.LENGTH_SHORT).show();
                            }


                        }
                    }

                    @Override
                    public void onFailure(Call<RegistrationResponse> call, Throwable t) {
                     Toast.makeText(RegisterEvent.this,"Fail",Toast.LENGTH_LONG).show();
                    }
                });
            }
        });



    }

    private void initView() {
        survey = (TextView) findViewById(R.id.survey);
        name = (EditText) findViewById(R.id.name);
        inputName = (TextInputLayout) findViewById(R.id.inputName);
        input_Phone = (EditText) findViewById(R.id.input_Phone);
        inputPhone = (TextInputLayout) findViewById(R.id.inputPhone);
        gender = (Spinner) findViewById(R.id.gender);
        next = (Button) findViewById(R.id.nextbutton);
    }
}

