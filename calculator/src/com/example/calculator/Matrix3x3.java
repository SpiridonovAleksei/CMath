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
public class Matrix3x3 extends Activity {


    String[] data = {"2x2", "3x3", "4x4"};

    int a11,a12,a13,a21,a22,a23,a31,a32,a33, res;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matrix3x3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setAdapter(adapter);

        spinner.setPrompt("Матрица");

        spinner.setSelection(1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();

                if(position == 0) {
                    Intent intent = new Intent(Matrix3x3.this, Matrix2x2.class);
                    startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(Matrix3x3.this, Matrix4x4.class);
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
        final EditText text21 = (EditText) findViewById(R.id.txt21);
        final EditText text22 = (EditText) findViewById(R.id.txt22);
        final EditText text23 = (EditText) findViewById(R.id.txt23);
        final EditText text31 = (EditText) findViewById(R.id.txt31);
        final EditText text32 = (EditText) findViewById(R.id.txt32);
        final EditText text33 = (EditText) findViewById(R.id.txt33);
        final TextView answer = (TextView) findViewById(R.id.txtresult);


        Button result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                a11 = Integer.parseInt(text11.getText().toString());
                a12 = Integer.parseInt(text12.getText().toString());
                a13 = Integer.parseInt(text13.getText().toString());
                a21 = Integer.parseInt(text21.getText().toString());
                a22 = Integer.parseInt(text22.getText().toString());
                a23 = Integer.parseInt(text23.getText().toString());
                a31 = Integer.parseInt(text31.getText().toString());
                a32 = Integer.parseInt(text32.getText().toString());
                a33 = Integer.parseInt(text33.getText().toString());

                res = (a11*a22*a33) + (a12*a23*a31) + (a21*a32*a13) - (a31*a22*a13) - (a12*a21*a33) - (a11*a23*a32);

                answer.setText("Det = " + res);

            }
        });

    }
}
