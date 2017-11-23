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

    public int compute(String op){
        String infixOp = op.trim();
        InfixToPostfixConverter Converter = new InfixToPostfixConverter();
        String postfix = Converter.inf2postf(infixOp);
        PostfixEvaluator Evaluator = new PostfixEvaluator();
        return(Evaluator.evaluate(postfix.toCharArray()));
    }

    public void add(View view) {
        int firstOp = compute(((EditText) findViewById(R.id.editText)).getText().toString());
        int secondOp = compute(((EditText) findViewById(R.id.editText2)).getText().toString());
        EditText result = (EditText) findViewById(R.id.editText3);
        int r = firstOp+secondOp;
        result.setText(Integer.toString(r));
    }
    public void subtract(View view) {
        int firstOp = compute(((EditText) findViewById(R.id.editText)).getText().toString());
        int secondOp = compute(((EditText) findViewById(R.id.editText2)).getText().toString());
        EditText result = (EditText) findViewById(R.id.editText3);
        int r = firstOp-secondOp;
        result.setText(Integer.toString(r));
    }
    public void multiply(View view) {
        int firstOp = compute(((EditText) findViewById(R.id.editText)).getText().toString());
        int secondOp = compute(((EditText) findViewById(R.id.editText2)).getText().toString());
        EditText result = (EditText) findViewById(R.id.editText3);
        int r = firstOp*secondOp;
        result.setText(Integer.toString(r));
    }
    public void divide(View view) {
        int firstOp = compute(((EditText) findViewById(R.id.editText)).getText().toString());
        int secondOp = compute(((EditText) findViewById(R.id.editText2)).getText().toString());
        EditText result = (EditText) findViewById(R.id.editText3);
        if(secondOp != 0) {
            int r = firstOp / secondOp;
            result.setText(Integer.toString(r));
        }
        else
            result.setText("Cannot Divide By Zero");

    }
    public void sqrt(View view) {
        int firstOp = compute(((EditText) findViewById(R.id.editText)).getText().toString());
        EditText result = (EditText) findViewById(R.id.editText3);
        if(firstOp >= 0) {
            double r = Math.sqrt(firstOp);
            result.setText(Double.toString(r));
        }
        else
            result.setText("Cannot sqrt a negative number");
    }
    public void pow(View view) {
        int firstOp = compute(((EditText) findViewById(R.id.editText)).getText().toString());
        int secondOp = compute(((EditText) findViewById(R.id.editText2)).getText().toString());
        EditText result = (EditText) findViewById(R.id.editText3);
        double r = Math.pow(firstOp,secondOp);
        result.setText(Double.toString(r));
    }
    @SuppressLint("SetTextI18n")
    public void clear(View view){
        EditText result = (EditText) findViewById(R.id.editText3);
        result.setText("");
        ((EditText) findViewById(R.id.editText)).setText("");
        ((EditText) findViewById(R.id.editText2)).setText("");
    }
}
