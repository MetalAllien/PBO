package com.example.linear;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button linear, relative, login, view, negara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        linear = findViewById(R.id.btnLinear);
        relative = findViewById(R.id.btnRelative);
        login = findViewById(R.id.btnLogin);
        view = findViewById(R.id.btnView);
        negara = findViewById(R.id.btnNegara);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linearlayout = new Intent(Menu.this, LinearLayout.class);
                startActivity(linearlayout);
            }
        });
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relativelayout = new Intent(Menu.this, RelativeLayout.class);
                startActivity(relativelayout);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menulogin = new Intent(Menu.this, Login.class);
                startActivity(menulogin);
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewData = new Intent(Menu.this, ListData.class);
                startActivity(viewData);
            }
        });
        negara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuNegara = new Intent(Menu.this, ListVieww.class);
                startActivity(menuNegara);
            }
        });
    }
}