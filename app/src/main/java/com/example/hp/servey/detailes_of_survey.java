package com.example.hp.servey;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

public class detailes_of_survey extends AppCompatActivity {

    protected RecyclerView recyleviewOfDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_detailes_of_survey);
        initView();
    }

    private void initView() {
        recyleviewOfDetails = (RecyclerView) findViewById(R.id.recyleview_of_Details);
    }
}
