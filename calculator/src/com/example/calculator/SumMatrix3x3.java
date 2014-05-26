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
 * Time: 23:30
 * To change this template use File | Settings | File Templates.
 */
public class SumMatrix3x3 extends Activity {

    int m11,m12,m13,m21,m22,m23,m31,m32,m33,n11,n12,n13,n21,n22,n23,n31,n32,n33, mat11,mat12,mat13,mat21,mat22,mat23,mat31,mat32,mat33;

    EditText c11,c12,c13,c21,c22,c23,c31,c32,c33,s11,s12,s13,s21,s22,s23,s31,s32,s33;

    String[] data = {"2x2", "3x3", "4x4"};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summatrix3x3);


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
                    Intent intent = new Intent(SumMatrix3x3.this, SumMatrix2x2.class);
                    startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(SumMatrix3x3.this, SumMatrix4x4.class);
                    startActivity(intent);

                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });



        c11 = (EditText) findViewById(R.id.a11);
        c12 = (EditText) findViewById(R.id.a12);
        c13 = (EditText) findViewById(R.id.a13);
        c21 = (EditText) findViewById(R.id.a21);
        c22 = (EditText) findViewById(R.id.a22);
        c23 = (EditText) findViewById(R.id.a23);
        c31 = (EditText) findViewById(R.id.a31);
        c32 = (EditText) findViewById(R.id.a32);
        c33 = (EditText) findViewById(R.id.a33);
        s11 = (EditText) findViewById(R.id.b11);
        s12 = (EditText) findViewById(R.id.b12);
        s13 = (EditText) findViewById(R.id.b13);
        s21 = (EditText) findViewById(R.id.b21);
        s22 = (EditText) findViewById(R.id.b22);
        s23 = (EditText) findViewById(R.id.b23);
        s31 = (EditText) findViewById(R.id.b31);
        s32 = (EditText) findViewById(R.id.b32);
        s33 = (EditText) findViewById(R.id.b33);

        Button result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                m11 = Integer.parseInt(c11.getText().toString());
                m12 = Integer.parseInt(c12.getText().toString());
                m13 = Integer.parseInt(c13.getText().toString());
                m21 = Integer.parseInt(c21.getText().toString());
                m22 = Integer.parseInt(c22.getText().toString());
                m23 = Integer.parseInt(c23.getText().toString());
                m31 = Integer.parseInt(c31.getText().toString());
                m32 = Integer.parseInt(c32.getText().toString());
                m33 = Integer.parseInt(c33.getText().toString());
                n11 = Integer.parseInt(s11.getText().toString());
                n12 = Integer.parseInt(s12.getText().toString());
                n13 = Integer.parseInt(s13.getText().toString());
                n21 = Integer.parseInt(s21.getText().toString());
                n22 = Integer.parseInt(s22.getText().toString());
                n23 = Integer.parseInt(s23.getText().toString());
                n31 = Integer.parseInt(s31.getText().toString());
                n32 = Integer.parseInt(s32.getText().toString());
                n33 = Integer.parseInt(s33.getText().toString());

                mat11 = m11+n11;
                mat12 = m12+n22;
                mat13 = m13+n13;
                mat21 = m21+n21;
                mat22 = m22+n22;
                mat23 = m23+n23;
                mat31 = m31+n31;
                mat32 = m32+n32;
                mat33 = m33+n33;


                Intent intent = new Intent(SumMatrix3x3.this, SumMatrixRes3x3.class);
                intent.putExtra("mat11", mat11);
                intent.putExtra("mat12", mat12);
                intent.putExtra("mat13", mat13);
                intent.putExtra("mat21", mat21);
                intent.putExtra("mat22", mat22);
                intent.putExtra("mat23", mat23);
                intent.putExtra("mat31", mat31);
                intent.putExtra("mat32", mat32);
                intent.putExtra("mat33", mat33);
                startActivity(intent);

            }
        });




    }
}
