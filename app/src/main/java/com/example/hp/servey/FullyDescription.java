package com.example.hp.servey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FullyDescription extends AppCompatActivity {

    Button Register_Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fully_description);
        Register_Button=findViewById(R.id.Registration_Button);
        Register_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FullyDescription.this,RegisterEvent.class);

                intent.putExtra("m_id",getIntent().getIntExtra("m_id",1));
                intent.putExtra("entities_id",getIntent().getStringExtra("entities_id"));
                intent.putExtra("password",getIntent().getStringExtra("password"));
                startActivity(intent);
            }
        });
    }
}
