package com.dounia.moroccaneye;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;
import android.content.Context;
public class singup extends AppCompatActivity {
    private TextView sign_up;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openmain();
            }
        });
        sign_up = findViewById(R.id.sign_up);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinscrire();
            }
        });

    }
    public void openmain (){
        Intent intent = new Intent(this, MainActivity.class);
    }
    public void openinscrire (){
        Intent intent = new Intent(this, sinscrire.class);
    }
}