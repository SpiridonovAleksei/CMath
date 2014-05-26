package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: Константин
 * Date: 14.04.14
 * Time: 23:38
 * To change this template use File | Settings | File Templates.
 */
public class SumMatrixRes3x3 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summatrixres3x3);

        TextView Txt11 = (TextView)findViewById(R.id.txt11);
        TextView Txt12 = (TextView)findViewById(R.id.txt12);
        TextView Txt13 = (TextView)findViewById(R.id.txt13);
        TextView Txt21 = (TextView)findViewById(R.id.txt21);
        TextView Txt22 = (TextView)findViewById(R.id.txt22);
        TextView Txt23 = (TextView)findViewById(R.id.txt23);
        TextView Txt31 = (TextView)findViewById(R.id.txt31);
        TextView Txt32 = (TextView)findViewById(R.id.txt32);
        TextView Txt33 = (TextView)findViewById(R.id.txt33);

        int Mat11 = getIntent().getIntExtra("mat11", 0);
        int Mat12 = getIntent().getIntExtra("mat12", 0);
        int Mat13 = getIntent().getIntExtra("mat13", 0);
        int Mat21 = getIntent().getIntExtra("mat21", 0);
        int Mat22 = getIntent().getIntExtra("mat22", 0);
        int Mat23 = getIntent().getIntExtra("mat23", 0);
        int Mat31 = getIntent().getIntExtra("mat31", 0);
        int Mat32 = getIntent().getIntExtra("mat32", 0);
        int Mat33 = getIntent().getIntExtra("mat33", 0);

        Txt11.setText(Integer.toString(Mat11));
        Txt12.setText(Integer.toString(Mat12));
        Txt13.setText(Integer.toString(Mat13));
        Txt21.setText(Integer.toString(Mat21));
        Txt22.setText(Integer.toString(Mat22));
        Txt23.setText(Integer.toString(Mat23));
        Txt31.setText(Integer.toString(Mat31));
        Txt32.setText(Integer.toString(Mat32));
        Txt33.setText(Integer.toString(Mat33));


    }
}
