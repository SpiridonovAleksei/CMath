package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: Константин
 * Date: 13.04.14
 * Time: 10:53
 * To change this template use File | Settings | File Templates.
 */
public class SquareEquation extends Activity {

    EditText x2, x, c;
    Integer a;
    Integer b;
    Integer s;
    Integer d;
    double res1;
    double res2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squareequation);
    x2 = (EditText) findViewById(R.id.x2);
    x = (EditText) findViewById(R.id.x);
    c = (EditText) findViewById(R.id.c);

    final TextView res = (TextView) findViewById(R.id.res);
    final TextView res3 = (TextView) findViewById(R.id.res3);


    Button result = (Button) findViewById(R.id.result);
    result.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //To change body of implemented methods use File | Settings | File Templates.
            a = Integer.parseInt(x2.getText().toString());
            b = Integer.parseInt(x.getText().toString());
            s = Integer.parseInt(c.getText().toString());
            d = b*b - 4*a*s;
            if(d>0) {
               res1 = ((-b) + Math.sqrt(d))/(2*a);
               res2 = ((-b) - Math.sqrt(d))/(2*a);
               res.setText("x1=" + String.format("%3f",res1));
               res3.setText("x2=" + String.format("%3f",res2));
            }
            else if (d == 0){
                res1 = res2 = -(b/2*a);
                res.setText("x1 = x2 = " + String.format("%3f", res1));
            }
            else {res.setText("Корней уравнения не существует, т.к D=" + d); }
        }
    });

}
}
