package com.example.sesion1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        String ciudad = getIntent().getExtras().getString("ciudad");
        Float temperatura = getIntent().getExtras().getFloat("temperatura");
        Float visibilidad = getIntent().getExtras().getFloat("visibilidad");
        String clima = getIntent().getExtras().getString("clima");
        TextView ciudadView = (TextView)findViewById(R.id.textView2);
        ciudadView.setText(ciudad);
        TextView tempView = (TextView)findViewById(R.id.textView3);
        tempView.setText(String.valueOf(temperatura));
        TextView visibilidadView = (TextView)findViewById(R.id.textView4);
        visibilidadView.setText(String.valueOf(visibilidad));
        TextView climaView = (TextView)findViewById(R.id.textView5);
        climaView.setText(clima);
    }
}