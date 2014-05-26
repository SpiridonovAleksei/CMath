package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: Константин
 * Date: 14.04.14
 * Time: 22:17
 * To change this template use File | Settings | File Templates.
 */
public class SumMatrixRes2x2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summatrixres2x2);

        TextView a11 = (TextView) findViewById(R.id.txt11);
        TextView a12 = (TextView) findViewById(R.id.txt12);
        TextView a21 = (TextView) findViewById(R.id.txt21);
        TextView a22 = (TextView) findViewById(R.id.txt22);

        int sum1 = getIntent().getIntExtra("sum1", 0);
        int sum2 = getIntent().getIntExtra("sum2", 0);
        int sum3 = getIntent().getIntExtra("sum3", 0);
        int sum4 = getIntent().getIntExtra("sum4", 0);

        a11.setText(Integer.toString(sum1));
        a12.setText(Integer.toString(sum2));
        a21.setText(Integer.toString(sum3));
        a22.setText(Integer.toString(sum4));

    }
}
