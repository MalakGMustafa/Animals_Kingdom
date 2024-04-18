package com.example.animals_kingdom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);


        search = findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSendActivity3(v);
            }
        });
        Intent intent = getIntent();
    }

    public void onClickSendActivity3(View view){
        Intent intent3 = new Intent(this, MainActivity3.class);
        startActivity(intent3);
    }
}