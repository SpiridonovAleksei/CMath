package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/**
 * Created with IntelliJ IDEA.
 * User: Константин
 * Date: 14.04.14
 * Time: 15:53
 * To change this template use File | Settings | File Templates.
 */
public class Matrix4x4 extends Activity {

    String[] data = {"2x2", "3x3", "4x4"};

    int a11,a12,a13,a14,a21,a22,a23,a24,a31,a32,a33,a34,a41,a42,a43,a44, res, res1,res2,res3,res4;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matrix4x4);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setAdapter(adapter);

        spinner.setPrompt("Матрица");

        spinner.setSelection(2);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                if(position == 1) {
                    Intent intent = new Intent(Matrix4x4.this, Matrix3x3.class);
                    startActivity(intent);
                }
                else if(position == 0){
                    Intent intent = new Intent(Matrix4x4.this, Matrix2x2.class);
                    startActivity(intent);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final EditText text11 = (EditText) findViewById(R.id.txt11);
        final EditText text12 = (EditText) findViewById(R.id.txt12);
        final EditText text13 = (EditText) findViewById(R.id.txt13);
        final EditText text14 = (EditText) findViewById(R.id.txt14);
        final EditText text21 = (EditText) findViewById(R.id.txt21);
        final EditText text22 = (EditText) findViewById(R.id.txt22);
        final EditText text23 = (EditText) findViewById(R.id.txt23);
        final EditText text24 = (EditText) findViewById(R.id.txt24);
        final EditText text31 = (EditText) findViewById(R.id.txt31);
        final EditText text32 = (EditText) findViewById(R.id.txt32);
        final EditText text33 = (EditText) findViewById(R.id.txt33);
        final EditText text34 = (EditText) findViewById(R.id.txt34);
        final EditText text41 = (EditText) findViewById(R.id.txt41);
        final EditText text42 = (EditText) findViewById(R.id.txt42);
        final EditText text43 = (EditText) findViewById(R.id.txt43);
        final EditText text44 = (EditText) findViewById(R.id.txt44);
        final TextView answer = (TextView) findViewById(R.id.txtresult);

        Button result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                a11 = Integer.parseInt(text11.getText().toString());
                a12 = Integer.parseInt(text12.getText().toString());
                a13 = Integer.parseInt(text13.getText().toString());
                a14 = Integer.parseInt(text14.getText().toString());
                a21 = Integer.parseInt(text21.getText().toString());
                a22 = Integer.parseInt(text22.getText().toString());
                a23 = Integer.parseInt(text23.getText().toString());
                a24 = Integer.parseInt(text24.getText().toString());
                a31 = Integer.parseInt(text31.getText().toString());
                a32 = Integer.parseInt(text32.getText().toString());
                a33 = Integer.parseInt(text33.getText().toString());
                a34 = Integer.parseInt(text34.getText().toString());
                a41 = Integer.parseInt(text41.getText().toString());
                a42 = Integer.parseInt(text42.getText().toString());
                a43 = Integer.parseInt(text43.getText().toString());
                a44 = Integer.parseInt(text44.getText().toString());

                res1 = (a22*a33*a44) + (a23*a34*a42) + (a32*a43*a24) - (a42*a33*a24) - (a23*a32*a44) - (a22*a34*a43);
                res2 = (a21*a33*a44) + (a23*a34*a41) + (a31*a43*a44) - (a41*a33*a24) - (a23*a31*a44) - (a21*a34*a43);
                res3 = (a21*a32*a44) + (a22*a34*a41) + (a31*a42*a44) - (a41*a32*a24) - (a22*a31*a44) - (a21*a34*a42);
                res4 = (a21*a32*a43) + (a22*a33*a41) + (a31*a42*a23) - (a41*a32*a23) - (a22*a31*a43) - (a21*a33*a42);

                res = (a11*res1) - (a12*res2) + (a13*res3) - (a14*res4);

                answer.setText("Det = " + res);

            }
        });

}
}
