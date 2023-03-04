package com.example.daniel.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_layout);
    }
public void buttonClicked(View v) {

    EditText weightView = (EditText) findViewById(R.id.weightBox);
    String wS = weightView.getText().toString();
    EditText heightView = (EditText) findViewById(R.id.heightBox);
    String hS = heightView.getText().toString();

    double wD = BMIModel.toDouble(wS);
    double hD = BMIModel.toDouble(hS);
    double bmiD = BMIModel.getBMI(wD, hD);
    String bmiS = BMIModel.formatBMI(bmiD);
    ((TextView) findViewById(R.id.answer)).setText(bmiS);
}
}
