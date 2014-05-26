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
 * Time: 22:02
 * To change this template use File | Settings | File Templates.
 */
public class SumMatrix2x2  extends Activity {

    String[] data = {"2x2", "3x3", "4x4"};

    int a11,a12,a21,a22,b11,b12,b21,b22,sum1,sum2,sum3,sum4, res;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summatrix2x2);

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
                    Intent intent = new Intent(SumMatrix2x2.this, SumMatrix3x3.class);
                    startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(SumMatrix2x2.this, SumMatrix4x4.class);
                    startActivity(intent);

                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });




        final EditText t11 = (EditText) findViewById(R.id.txt11);
        final EditText t12 = (EditText) findViewById(R.id.txt12);
        final EditText t21 = (EditText) findViewById(R.id.txt21);
        final EditText t22 = (EditText) findViewById(R.id.txt22);
        final EditText r11 = (EditText) findViewById(R.id.t11);
        final EditText r12 = (EditText) findViewById(R.id.t12);
        final EditText r21 = (EditText) findViewById(R.id.t21);
        final EditText r22 = (EditText) findViewById(R.id.t22);

        Button result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                a11 = Integer.parseInt(t11.getText().toString());
                a12 = Integer.parseInt(t12.getText().toString());
                a21 = Integer.parseInt(t21.getText().toString());
                a22 = Integer.parseInt(t22.getText().toString());
                b11 = Integer.parseInt(r11.getText().toString());
                b12 = Integer.parseInt(r12.getText().toString());
                b21 = Integer.parseInt(r21.getText().toString());
                b22 = Integer.parseInt(r22.getText().toString());

                sum1 = a11 + b11;
                sum2 = a12 + b12;
                sum3 = a21 + b21;
                sum4 = a22 + b22;

                Intent intent = new Intent(SumMatrix2x2.this, SumMatrixRes2x2.class);
                intent.putExtra("sum1", sum1);
                intent.putExtra("sum2", sum2);
                intent.putExtra("sum3", sum3);
                intent.putExtra("sum4", sum4);
                startActivity(intent);



            }
        });

    }
}
