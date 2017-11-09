package com.qniyaz.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        String answer = "";
        Button add = (Button) findViewById(R.id.button);
        EditText result = (EditText) findViewById(R.id.editText3);
        result.setText(answer);
    }
    public void subtract(View view) {
        Button sub = (Button) findViewById(R.id.button);
        EditText result = (EditText) findViewById(R.id.editText3);
    }
    public void multiply(View view) {
        Button mult = (Button) findViewById(R.id.button);
        EditText result = (EditText) findViewById(R.id.editText3);
    }
    public void divide(View view) {
        Button div = (Button) findViewById(R.id.button);
        EditText result = (EditText) findViewById(R.id.editText3);
    }
    public void sqrt(View view) {
        Button sqrt = (Button) findViewById(R.id.button);
        EditText result = (EditText) findViewById(R.id.editText3);
    }
    public void pow(View view) {
        Button pow = (Button) findViewById(R.id.button);
        EditText result = (EditText) findViewById(R.id.editText3);
    }
    public void clear(View view){
        Button clear = (Button) findViewById(R.id.button7);
        EditText result = (EditText) findViewById(R.id.editText3);
        result.setText("Result");
    }
}
