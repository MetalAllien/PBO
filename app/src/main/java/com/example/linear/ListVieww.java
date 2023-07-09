package com.example.linear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListVieww extends AppCompatActivity {

    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_vieww);

        lvResult = findViewById(R.id.lvResult);

        String[][] dataNegara = new String[][]{{"Indonesia", "ASIA", "indonesia"},
                {"Malaysia", "ASIA", "malaysia"}, {"Singapore", "ASIA", "singapore"},
                {"Italia", "EROPA", "italia"}, {"Inggris", "EROPA", "inggris"},
                {"Belanda", "EROPA", "belanda"}, {"Argentina", "AMERIKA", "argentina"},
                {"Chile", "AMERIKA", "chile"}, {"Mesir", "AFRIKA", "mesir"},
                {"Uganda", "AFRIKA", "uganda"}
        };
        NegaraAdapter adapter = new NegaraAdapter(ListVieww.this, dataNegara);
        lvResult.setAdapter(adapter);
    }
}