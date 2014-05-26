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
 * Time: 13:07
 * To change this template use File | Settings | File Templates.
 */
public class BiquadraticEquation extends Activity {

    EditText x4, x2, c;
    Integer a,y,y1;
    Integer b;
    Integer s;
    Integer d;
    double res1, res4;
    double res2, res5;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biquadraticequation);

        x4 = (EditText) findViewById(R.id.x4);
        x2 = (EditText) findViewById(R.id.x2);
        c = (EditText) findViewById(R.id.c);

        final TextView res = (TextView) findViewById(R.id.res);
        final TextView res3 = (TextView) findViewById(R.id.res3);
        final TextView res6 = (TextView) findViewById(R.id.res6);
        final TextView res7 = (TextView) findViewById(R.id.res7);


        Button result = (Button) findViewById(R.id.result) ;
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.
                a = Integer.parseInt(x4.getText().toString());
                b = Integer.parseInt(x2.getText().toString());
                s = Integer.parseInt(c.getText().toString());

                d = b*b - 4*a*s;
                if(d>0) {
                    res1 = ((-b) + Math.sqrt(d))/(2*a);
                    res2 = ((-b) - Math.sqrt(d))/(2*a);
                        if(res1 < 0 && res2 < 0) {res.setText("Корней нет, так как t1<0" + "\n t1=" + res1);
                            res3.setText("t2<0 и t2=" + res2);
                        }
                            else if (res1 >= 0 && res2< 0) {
                              res4 = Math.sqrt(res1);
                              res5 = -Math.sqrt(res1);

                            res7.setText("t1=" + String.format("%3f",res1));
                            res.setText("x1=" + String.format("%3f",res4));
                            res3.setText("x2=" + String.format("%3f",res5));
                            res6.setText("t2=" + res2 + "<0 => t2 - посторонний корень" );

                        }
                            else if (res1 < 0 && res2 >=0){
                            res4 = Math.sqrt(res2);
                            res5 = -Math.sqrt(res2);

                            res7.setText("t2=" + String.format("%3f",res2));
                            res.setText("x1=" + String.format("%3f",res4));
                            res3.setText("x2=" + String.format("%3f",res5));
                            res6.setText("t1=" + res1 + "<0 => t1 - посторонний корень" );

                        }
                       // else (res1>= 0 && res2 >= 0){

                    //}
                  //  res.setText("x1=" + String.format("%3f",res1));
                  //  res3.setText("x2=" + String.format("%3f",res2));
                }
                else if (d == 0){
                    res1 = -(b/2*a);
                    if(res1 < 0) {res.setText("Уравнение не имеет корней");}
                    else if(res1>0) {
                        res4 = Math.sqrt(res1);
                        res5 = -Math.sqrt(res1);
                    res.setText("x1 = " + String.format("%3f", res4));
                    res3.setText("x2 = " + String.format("%3f", res5));
                }
                }
                    else {res.setText("Корней уравнения не существует, т.к D=" + d);
                          res3.setText("");
                          res7.setText("");
                          res6.setText("");
                }

            }
        });

    }
}
