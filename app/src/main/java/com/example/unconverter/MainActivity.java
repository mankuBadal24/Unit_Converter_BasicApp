package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " your work is done ...  kaam ho gya bhidu 😁😁", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();

                int kg = Integer.parseInt(s);
                if (kg >= 50) {
                    double pound = 2.205 * kg;
                    textView.setText("the corresponding value in pound is" + pound);
                } else if (kg == 0) {
                    textView.setText("invalid number \n" + "please try another number" );
                }
                else{
                    textView.setText("sorry");
                }
            }
        });
    }
}