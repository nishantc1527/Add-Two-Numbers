package com.example.addtwonumbers;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView num1 = findViewById(R.id.num1);
                TextView num2 = findViewById(R.id.num2);

                try {
                    long sum = Long.parseLong(num1.getText().toString()) + Long.parseLong(num2.getText().toString());
                    TextView resView = findViewById(R.id.res);
                    resView.setText(sum + "");
                } catch (NumberFormatException e) {
                    TextView resView = findViewById(R.id.res);
                    resView.setText("Number Is To Large");
                }
            }
        });
    }
}
