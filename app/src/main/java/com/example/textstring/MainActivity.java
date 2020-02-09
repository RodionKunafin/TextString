package com.example.textstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultField;
    private Button btnPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void numPress(View view) {
        int id = view.getId();
        if (id == R.id.btn0) {
            resultField.setText("0");
        }
        if (id == R.id.btn1) {
            resultField.setText("1");
        }
        if (id == R.id.btn2) {
            resultField.setText("2");
        }
        if (id==R.id.btn3){
            resultField.setText("3");
        }
        if (id==R.id.btn4){
            resultField.setText("4");
        }
        if (id==R.id.btn5){
            resultField.setText("5");
        }
        if (id==R.id.btn6){
            resultField.setText("6");
        }
        if (id==R.id.btn7){
            resultField.setText("7");
        }
        if (id==R.id.btn8){
            resultField.setText("8");
        }
        if (id==R.id.btn9){
            resultField.setText("9");
        }
    }
    public void dotPress(View v){
        int id = v.getId();
        if (id==R.id.btnPoint){
            resultField.setText(".");
        }
    }

    private void initViews() {
        resultField  = findViewById(R.id.resultField);
        btnPoint = findViewById(R.id.btnPoint);

    }

}
