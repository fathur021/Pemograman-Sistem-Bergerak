package com.example.a1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityMenu extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymenu); // Menggunakan activitymenu.xml
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case com.example.a1.R.id.action_search:
                Toast.makeText(this, "Please Wait", Toast.LENGTH_SHORT).show();
                return true;

            case com.example.a1.R.id.action_notification:
                Toast.makeText(this, "Loading Notification", Toast.LENGTH_SHORT).show();
                return true;

            case com.example.a1.R.id.action_profile:
                Toast.makeText(this, "Loading Profile", Toast.LENGTH_SHORT).show();
                return true;

            case com.example.a1.R.id.action_message:
                Toast.makeText(this, "Loading Message", Toast.LENGTH_SHORT).show();
                return true;

            case com.example.a1.R.id.action_upload:
                Toast.makeText(this, "Loading Upload", Toast.LENGTH_SHORT).show();
                return true;

            case com.example.a1.R.id.action_logout:
                Toast.makeText(this, "Anda Telah Log Out", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
