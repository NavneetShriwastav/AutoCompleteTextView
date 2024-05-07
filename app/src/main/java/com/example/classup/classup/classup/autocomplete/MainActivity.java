package com.example.classup.classup.classup.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView acv;
    ArrayList <String > arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acv = findViewById(R.id.acv);
        arrayList.add("apple");
        arrayList.add("app");
        arrayList.add("aalo");
        arrayList.add("aalkjfnvj");
        arrayList.add("ballo");
        arrayList.add("balllnfv ");
        arrayList.add("bf");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList);

        acv.setAdapter(adapter);
        acv.setThreshold(1);


    }
}