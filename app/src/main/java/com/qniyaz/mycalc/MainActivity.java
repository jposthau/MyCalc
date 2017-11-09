package com.qniyaz.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public float result;
    public String op1;
    public String op2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(){
        Button add = (Button) findViewById(R.id.button);
        Button sub = (Button) findViewById(R.id.button2);
        Button mult = (Button) findViewById(R.id.button3);
        Button div = (Button) findViewById(R.id.button4);
        Button sqrt = (Button) findViewById(R.id.button5);
        Button pow = (Button) findViewById(R.id.button6);
        EditText result = (EditText) findViewById(R.id.editText3);

        if(add.isActivated())
        {
            result.setText("It Works!");
        }
    }

    public void add(){

    }

    public void subtract(){

    }

    public void multiply(){

    }

    public void divide(){

    }

    public void sqrt(){

    }

    public void pow(){

    }
}
