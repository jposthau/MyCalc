package com.qniyaz.mycalc;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        String opA = ((EditText) findViewById(R.id.editText)).getText().toString();
        String opB = ((EditText) findViewById(R.id.editText2)).getText().toString();
        EditText result = (EditText) findViewById(R.id.editText3);
        result.setText(String.valueOf(Float.valueOf(opA) + Float.valueOf(opB)));
    }
    public void subtract(View view) {
        String opA = ((EditText) findViewById(R.id.editText)).getText().toString();
        String opB = ((EditText) findViewById(R.id.editText2)).getText().toString();
        EditText result = (EditText) findViewById(R.id.editText3);
        result.setText(String.valueOf(Float.valueOf(opA) - Float.valueOf(opB)));
    }
    public void multiply(View view) {
        String opA = ((EditText) findViewById(R.id.editText)).getText().toString();
        String opB = ((EditText) findViewById(R.id.editText2)).getText().toString();
        EditText result = (EditText) findViewById(R.id.editText3);
        result.setText(String.valueOf(Float.valueOf(opA) * Float.valueOf(opB)));
    }
    public void divide(View view) {
        String opA = ((EditText) findViewById(R.id.editText)).getText().toString();
        String opB = ((EditText) findViewById(R.id.editText2)).getText().toString();
        EditText result = (EditText) findViewById(R.id.editText3);
        result.setText(String.valueOf(Float.valueOf(opA) / Float.valueOf(opB)));
    }
    public void sqrt(View view) {
        String opA = ((EditText) findViewById(R.id.editText)).getText().toString();
        String opB = ((EditText) findViewById(R.id.editText2)).getText().toString();
        EditText result = (EditText) findViewById(R.id.editText3);
        result.setText(String.valueOf(Math.sqrt(Float.valueOf(opA))));
    }
    public void pow(View view) {
        String opA = ((EditText) findViewById(R.id.editText)).getText().toString();
        String opB = ((EditText) findViewById(R.id.editText2)).getText().toString();
        EditText result = (EditText) findViewById(R.id.editText3);
        result.setText(String.valueOf(Math.pow(Double.valueOf(opA),(Double.valueOf(opB)))));
    }
    @SuppressLint("SetTextI18n")
    public void clear(View view){
        String opA = ((EditText) findViewById(R.id.editText)).getText().toString();
        String opB = ((EditText) findViewById(R.id.editText2)).getText().toString();
        EditText result = (EditText) findViewById(R.id.editText3);
        result.setText("");
        ((EditText) findViewById(R.id.editText)).setText("");
        ((EditText) findViewById(R.id.editText2)).setText("");
    }
}
