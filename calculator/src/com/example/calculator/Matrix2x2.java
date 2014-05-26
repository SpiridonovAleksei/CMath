package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/**
 * Created with IntelliJ IDEA.
 * User: Константин
 * Date: 13.04.14
 * Time: 20:04
 * To change this template use File | Settings | File Templates.
 */
public class Matrix2x2 extends Activity {

    String[] data = {"2x2", "3x3", "4x4"};

    int a11,a12,a21,a22, res;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matrix2x2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setAdapter(adapter);

        spinner.setPrompt("Матрица");

        spinner.setSelection(0);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // показываем позиция нажатого элемента
                //Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                if(position == 1) {
                     Intent intent = new Intent(Matrix2x2.this, Matrix3x3.class);
                     startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(Matrix2x2.this, Matrix4x4.class);
                    startActivity(intent);

                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        final EditText text11 = (EditText) findViewById(R.id.txt11);
        final EditText text12 = (EditText) findViewById(R.id.txt12);
        final EditText text21 = (EditText) findViewById(R.id.txt21);
        final EditText text22 = (EditText) findViewById(R.id.txt22);
        final TextView answer = (TextView) findViewById(R.id.txtresult);


        Button result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                a11 = Integer.parseInt(text11.getText().toString());
                a12 = Integer.parseInt(text12.getText().toString());
                a21 = Integer.parseInt(text21.getText().toString());
                a22 = Integer.parseInt(text22.getText().toString());

                res = (a11*a22) - (a21*a12);

                answer.setText("Det = " + res);

            }
        });

    }
}