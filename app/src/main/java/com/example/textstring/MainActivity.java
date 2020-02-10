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
    Button btn0;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void numPress(View view) {
        int id = view.getId();
        if (id == R.id.btn0) {
            resultField.getText().toString();
            resultField.setText("0");
        }
        if (id == R.id.btn1) {
            resultField.getText().toString();
            resultField.setText("1");
        }
        if (id == R.id.btn2) {
            resultField.getText().toString();
            resultField.setText("2");
        }
        if (id==R.id.btn3){
            resultField.getText().toString();
            resultField.setText("3");
        }
        if (id==R.id.btn4){
            resultField.getText().toString();
            resultField.setText("4");
        }
        if (id==R.id.btn5){
            resultField.getText().toString();
            resultField.setText("5");
        }
        if (id==R.id.btn6){
            resultField.getText().toString();
            resultField.setText("6");
        }
        if (id==R.id.btn7){
            resultField.getText().toString();
            resultField.setText("7");
        }
        if (id==R.id.btn8){
            resultField.getText().toString();
            resultField.setText("8");
        }
        if (id==R.id.btn9){
            resultField.getText().toString();
            resultField.setText("9");
        }
    }
    public void dotPress(View v){
        int id = v.getId();
        if (id==R.id.btnPoint){
            resultField.getText().toString();
            resultField.setText(".");
        }
    }

    private void initViews() {
        resultField  = findViewById(R.id.resultField);
        btnPoint = findViewById(R.id.btnPoint);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);

    }

}
