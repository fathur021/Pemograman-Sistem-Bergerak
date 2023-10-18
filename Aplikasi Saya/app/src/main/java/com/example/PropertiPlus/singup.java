package com.example.PropertiPlus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.a1.R;

public class singup extends AppCompatActivity {

    private TextView t1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singup);
        t1 =(TextView) findViewById(R.id.Kelogin_id);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1 = new Intent(singup.this, Login.class);
                startActivity(a1);
            }
        });
    }
}