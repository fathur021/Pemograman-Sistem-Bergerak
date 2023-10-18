package com.example.PropertiPlus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a1.R;


public class Login extends AppCompatActivity {
    private Button btn1;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        text1 =(TextView) findViewById(R.id.kesingup);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p1 = new Intent(Login.this, singup.class);
                startActivity(p1);
            }
        });
    }
}