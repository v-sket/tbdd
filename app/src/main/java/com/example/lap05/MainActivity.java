package com.example.lap05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvDonut;
    private DonutAdapter adapter;
    private ArrayList<Donut> donutArrayList;

    private Button btnDonut,btnPinkDonut,btnTasty;
    private  EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDonut = (ListView) findViewById(R.id.listDonut);
        editText= (EditText) findViewById(R.id.editTextSreachFood);
        donutArrayList = new ArrayList<>();

        donutArrayList.add(new Donut("Tasty Donut", "Spicy tasty donut family", "10.00$", R.drawable.yellow_donut));
        donutArrayList.add(new Donut("Pink Donut", "Spicy tasty donut family", "20.00$", R.drawable.pink_donut));
        donutArrayList.add(new Donut("Floating Donut", "Spicy tasty donut family", "30.00$", R.drawable.green_donut));
        donutArrayList.add(new Donut("Tasty Donut", "Spicy tasty donut family", "40.00$", R.drawable.red_donut));

        adapter = new DonutAdapter(this, donutArrayList, R.layout.item_main);
        lvDonut.setAdapter(adapter);

        }
    }