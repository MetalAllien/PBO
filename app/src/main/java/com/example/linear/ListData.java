package com.example.linear;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class ListData extends AppCompatActivity {

        ImageView gambar;
        ListView listView;
        ArrayAdapter<String> arrayAdapter;
        String[] programmingLang = {
                "Java", "Android", "C++", "C#", "Visual Basic", "Ruby", "Python",
                "PHP", "Lisp"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list_data);
            listView = findViewById(R.id.listViewProgramming);
            arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, programmingLang);
            listView.setAdapter(arrayAdapter);
}
    }