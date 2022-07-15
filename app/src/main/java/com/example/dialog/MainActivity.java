package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bt1,bt2,bt3,bt4,bt5,bt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.dialog1);
        bt2 = findViewById(R.id.dialog2);
        bt3 = findViewById(R.id.dialog3);
        bt4 = findViewById(R.id.dialog4);
        bt5 = findViewById(R.id.dialog5);
        bt6 = findViewById(R.id.dialog6);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogMessage message = new DialogMessage();
                FragmentManager manager = getSupportFragmentManager();
                message.show(manager,"Dialog Message");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogCheckbox checkbox = new DialogCheckbox();
                FragmentManager manager = getSupportFragmentManager();
                checkbox.show(manager,"Dialog Message");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogSeekbar seekbar = new DialogSeekbar();
                FragmentManager manager = getSupportFragmentManager();
                seekbar.show(manager,"Dialog Message");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogSetNumber setNumber = new DialogSetNumber();
                FragmentManager manager = getSupportFragmentManager();
                setNumber.show(manager,"Dialog Message");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogTime time = new DialogTime();
                FragmentManager manager = getSupportFragmentManager();
                time.show(manager,"Dialog Message");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogDate date = new DialogDate();
                FragmentManager manager = getSupportFragmentManager();
                date.show(manager,"Dialog Message");
            }
        });
    }
}