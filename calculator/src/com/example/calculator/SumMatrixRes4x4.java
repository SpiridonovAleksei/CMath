package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: Константин
 * Date: 15.04.14
 * Time: 17:55
 * To change this template use File | Settings | File Templates.
 */
public class SumMatrixRes4x4 extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summatrixres4x4);

        TextView Txt11 = (TextView)findViewById(R.id.txt11);
        TextView Txt12 = (TextView)findViewById(R.id.txt12);
        TextView Txt13 = (TextView)findViewById(R.id.txt13);
        TextView Txt14 = (TextView)findViewById(R.id.txt14);
        TextView Txt21 = (TextView)findViewById(R.id.txt21);
        TextView Txt22 = (TextView)findViewById(R.id.txt22);
        TextView Txt23 = (TextView)findViewById(R.id.txt23);
        TextView Txt24 = (TextView)findViewById(R.id.txt24);
        TextView Txt31 = (TextView)findViewById(R.id.txt31);
        TextView Txt32 = (TextView)findViewById(R.id.txt32);
        TextView Txt33 = (TextView)findViewById(R.id.txt33);
        TextView Txt34 = (TextView)findViewById(R.id.txt34);
        TextView Txt41 = (TextView)findViewById(R.id.txt41);
        TextView Txt42 = (TextView)findViewById(R.id.txt42);
        TextView Txt43 = (TextView)findViewById(R.id.txt43);
        TextView Txt44 = (TextView)findViewById(R.id.txt44);

        int Mat11 = getIntent().getIntExtra("mat11", 0);
        int Mat12 = getIntent().getIntExtra("mat12", 0);
        int Mat13 = getIntent().getIntExtra("mat13", 0);
        int Mat14 = getIntent().getIntExtra("mat14", 0);
        int Mat21 = getIntent().getIntExtra("mat21", 0);
        int Mat22 = getIntent().getIntExtra("mat22", 0);
        int Mat23 = getIntent().getIntExtra("mat23", 0);
        int Mat24 = getIntent().getIntExtra("mat24", 0);
        int Mat31 = getIntent().getIntExtra("mat31", 0);
        int Mat32 = getIntent().getIntExtra("mat32", 0);
        int Mat33 = getIntent().getIntExtra("mat33", 0);
        int Mat34 = getIntent().getIntExtra("mat34", 0);
        int Mat41 = getIntent().getIntExtra("mat41", 0);
        int Mat42 = getIntent().getIntExtra("mat42", 0);
        int Mat43 = getIntent().getIntExtra("mat43", 0);
        int Mat44 = getIntent().getIntExtra("mat44", 0);

        Txt11.setText(Integer.toString(Mat11));
        Txt12.setText(Integer.toString(Mat12));
        Txt13.setText(Integer.toString(Mat13));
        Txt14.setText(Integer.toString(Mat14));
        Txt21.setText(Integer.toString(Mat21));
        Txt22.setText(Integer.toString(Mat22));
        Txt23.setText(Integer.toString(Mat23));
        Txt24.setText(Integer.toString(Mat24));
        Txt31.setText(Integer.toString(Mat31));
        Txt32.setText(Integer.toString(Mat32));
        Txt33.setText(Integer.toString(Mat33));
        Txt34.setText(Integer.toString(Mat34));
        Txt41.setText(Integer.toString(Mat41));
        Txt42.setText(Integer.toString(Mat42));
        Txt43.setText(Integer.toString(Mat43));
        Txt44.setText(Integer.toString(Mat44));


    }
}
