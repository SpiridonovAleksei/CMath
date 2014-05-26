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
 * Date: 16.04.14
 * Time: 18:13
 * To change this template use File | Settings | File Templates.
 */
public class EquationOfTheLine extends Activity {

    int x,y,z,c,v, res1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.equationoftheline);

        final EditText text1 = (EditText) findViewById(R.id.x1);
        final EditText text2 = (EditText) findViewById(R.id.y1);
        final EditText text3 = (EditText) findViewById(R.id.a);
        final EditText text4 = (EditText) findViewById(R.id.b);
        final EditText text5 = (EditText) findViewById(R.id.c);
        final TextView res = (TextView) findViewById(R.id.res);

        Button result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                x = Integer.parseInt(text1.getText().toString());
                y = Integer.parseInt(text2.getText().toString());
                z = Integer.parseInt(text3.getText().toString());
                c = Integer.parseInt(text4.getText().toString());
                v = Integer.parseInt(text5.getText().toString());

                res1 = z*(-x) + c*(-y);
                if(res1 > 0){
                res.setText(z + "x" + c + "y" + "+" + res1 + "=0");
                }
                if(res1 < 0) {
                    res.setText(z + "x" + c + "y" + "-" + res1 + "=0");
                }
            }
        });

    }


}
