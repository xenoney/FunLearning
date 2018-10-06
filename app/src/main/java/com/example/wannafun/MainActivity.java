package com.example.wannafun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFaggJeff, btnXen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFaggJeff = findViewById(R.id.buttonJeff);
        btnXen = findViewById(R.id.buttonXen);
        btnFaggJeff.setOnClickListener(this);
        btnXen.setOnClickListener(this);
    }

    //@Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonJeff:
                Intent intentJeff = new Intent(this, JeffActivity.class);
                startActivity(intentJeff);
                break;
            case R.id.buttonXen:
                Intent intentXen = new Intent(this, XenActivity.class);
                startActivity(intentXen);
                break;
        }
    }
}
