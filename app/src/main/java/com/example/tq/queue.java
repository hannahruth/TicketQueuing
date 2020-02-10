package com.example.tq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageButton;

public class queue extends AppCompatActivity {

    private Button goback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

        goback = (Button) findViewById(R.id.goback);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMovie_Details();
            }
        });

    }

    public void openMovie_Details() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
