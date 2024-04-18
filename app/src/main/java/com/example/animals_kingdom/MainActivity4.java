package com.example.animals_kingdom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private Button search2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
      //  Intent intent = getIntent();
        search2 = findViewById(R.id.search2);
        search2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSendActivity5(v);
            }
        });
    }

    public void onClickSendActivity5(View view){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}