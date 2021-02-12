package com.example.sesion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONObject;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void buttonAsu (View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://api.openweathermap.org/data/2.5/weather?q=Asuncion&appid=1abc6ce006675ee38063d045d616748f";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>(){
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response.toString());
                ObjectMapper mapper = new ObjectMapper();
                try {
                    WeatherData data = mapper.readValue(response.toString(), WeatherData.class);
                    System.out.println(data);
                    Intent intent = new Intent(view.getContext(), WeatherActivity.class);
                    intent.putExtra("ciudad", "Asuncion");
                    intent.putExtra("temperatura", data.getMain().getTemp());
                    intent.putExtra("clima", data.getWeather().get(0).getDescription());
                    intent.putExtra("visibilidad", data.getVisibility());
                    startActivity(intent);
                }
                catch (IOException ex){
                    ex.printStackTrace();                    
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("Error");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(jsonObjectRequest);
        //api.openweathermap.org/data/2.5/weather?q={Asuncion}&appid={21};
    }
    public void buttonCDE (View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://api.openweathermap.org/data/2.5/weather?q=CiudaddelEste&appid=1abc6ce006675ee38063d045d616748f";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>(){
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response.toString());
                ObjectMapper mapper = new ObjectMapper();
                try {
                    WeatherData data = mapper.readValue(response.toString(), WeatherData.class);
                    System.out.println(data);
                    Intent intent = new Intent(view.getContext(), WeatherActivity.class);
                    intent.putExtra("ciudad", "Ciudad del Este");
                    intent.putExtra("temperatura", data.getMain().getTemp());
                    intent.putExtra("clima", data.getWeather().get(0).getDescription());
                    intent.putExtra("visibilidad", data.getVisibility());
                    startActivity(intent);
                }
                catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("Error");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(jsonObjectRequest);
        //api.openweathermap.org/data/2.5/weather?q={Asuncion}&appid={21};
    }
    public void buttonEncar (View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://api.openweathermap.org/data/2.5/weather?q=Encarnacion&appid=1abc6ce006675ee38063d045d616748f";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>(){
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response.toString());
                ObjectMapper mapper = new ObjectMapper();
                try {
                    WeatherData data = mapper.readValue(response.toString(), WeatherData.class);
                    System.out.println(data);
                    Intent intent = new Intent(view.getContext(), WeatherActivity.class);
                    intent.putExtra("ciudad", "Encarnación");
                    intent.putExtra("temperatura", data.getMain().getTemp());
                    intent.putExtra("clima", data.getWeather().get(0).getDescription());
                    intent.putExtra("visibilidad", data.getVisibility());
                    startActivity(intent);
                }
                catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("Error");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(jsonObjectRequest);
        //api.openweathermap.org/data/2.5/weather?q={Asuncion}&appid={21};
    }
    public void buttonLoma (View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://api.openweathermap.org/data/2.5/weather?q=LomaPlata&appid=1abc6ce006675ee38063d045d616748f";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>(){
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response.toString());
                ObjectMapper mapper = new ObjectMapper();
                try {
                    WeatherData data = mapper.readValue(response.toString(), WeatherData.class);
                    System.out.println(data);
                    Intent intent = new Intent(view.getContext(), WeatherActivity.class);
                    intent.putExtra("ciudad", "Loma Plata");
                    intent.putExtra("temperatura", data.getMain().getTemp());
                    intent.putExtra("clima", data.getWeather().get(0).getDescription());
                    intent.putExtra("visibilidad", data.getVisibility());
                    startActivity(intent);
                }
                catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("Error");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(jsonObjectRequest);
        //api.openweathermap.org/data/2.5/weather?q={Asuncion}&appid={21};
    }
    public void buttonVilla (View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://api.openweathermap.org/data/2.5/weather?q=Villarica&appid=1abc6ce006675ee38063d045d616748f";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>(){
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response.toString());
                ObjectMapper mapper = new ObjectMapper();
                try {
                    WeatherData data = mapper.readValue(response.toString(), WeatherData.class);
                    System.out.println(data);
                    Intent intent = new Intent(view.getContext(), WeatherActivity.class);
                    intent.putExtra("ciudad", "Villa Rica");
                    intent.putExtra("temperatura", data.getMain().getTemp());
                    intent.putExtra("clima", data.getWeather().get(0).getDescription());
                    intent.putExtra("visibilidad", data.getVisibility());
                    startActivity(intent);
                }
                catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("Error");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(jsonObjectRequest);
        //api.openweathermap.org/data/2.5/weather?q={Asuncion}&appid={21};
    }
}