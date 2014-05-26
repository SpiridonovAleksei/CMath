package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


/**
 * Created with IntelliJ IDEA.
 * User: Константин
 * Date: 15.04.14
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 */
public class SumMatrix4x4 extends Activity {

    String[] data = {"2x2", "3x3", "4x4"};

    int m11,m12,m13,m14,m21,m22,m23,m24,m31,m32,m33,m34,m41,m42,m43,m44,n11,n12,n13,n14,n21,n22,n23,n24,n31,n32,n33,n34,n41,n42,n43,n44, mat11,mat12,mat13,mat14,mat21,mat22,mat23,mat24,mat31,mat32,mat33,mat34,mat41,mat42,mat43,mat44;

    EditText c11,c12,c13,c14,c21,c22,c23,c24,c31,c32,c33,c34,c41,c42,c43,c44,s11,s12,s13,s14,s21,s22,s23,s24,s31,s32,s33,s34,s41,s42,s43,s44;



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summatrix4x4);



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
                if(position == 0) {
                    Intent intent = new Intent(SumMatrix4x4.this, SumMatrix2x2.class);
                    startActivity(intent);
                }
                else if(position == 1){
                    Intent intent = new Intent(SumMatrix4x4.this, SumMatrix3x3.class);
                    startActivity(intent);

                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        c11 = (EditText) findViewById(R.id.txt11);
        c12 = (EditText) findViewById(R.id.txt12);
        c13 = (EditText) findViewById(R.id.txt13);
        c14 = (EditText) findViewById(R.id.txt14);
        c21 = (EditText) findViewById(R.id.txt21);
        c22 = (EditText) findViewById(R.id.txt22);
        c23 = (EditText) findViewById(R.id.txt23);
        c24 = (EditText) findViewById(R.id.txt24);
        c31 = (EditText) findViewById(R.id.txt31);
        c32 = (EditText) findViewById(R.id.txt32);
        c33 = (EditText) findViewById(R.id.txt33);
        c34 = (EditText) findViewById(R.id.txt34);
        c41 = (EditText) findViewById(R.id.txt41);
        c42 = (EditText) findViewById(R.id.txt42);
        c43 = (EditText) findViewById(R.id.txt43);
        c44 = (EditText) findViewById(R.id.txt44);
        s11 = (EditText) findViewById(R.id.t11);
        s12 = (EditText) findViewById(R.id.t12);
        s13 = (EditText) findViewById(R.id.t13);
        s14 = (EditText) findViewById(R.id.t14);
        s21 = (EditText) findViewById(R.id.t21);
        s22 = (EditText) findViewById(R.id.t22);
        s23 = (EditText) findViewById(R.id.t23);
        s24 = (EditText) findViewById(R.id.t24);
        s31 = (EditText) findViewById(R.id.t31);
        s32 = (EditText) findViewById(R.id.t32);
        s33 = (EditText) findViewById(R.id.t33);
        s34 = (EditText) findViewById(R.id.t34);
        s41 = (EditText) findViewById(R.id.t41);
        s42 = (EditText) findViewById(R.id.t42);
        s43 = (EditText) findViewById(R.id.t43);
        s44 = (EditText) findViewById(R.id.t44);

        Button result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                m11 = Integer.parseInt(c11.getText().toString());
                m12 = Integer.parseInt(c12.getText().toString());
                m13 = Integer.parseInt(c13.getText().toString());
                m14 = Integer.parseInt(c14.getText().toString());
                m21 = Integer.parseInt(c21.getText().toString());
                m22 = Integer.parseInt(c22.getText().toString());
                m23 = Integer.parseInt(c23.getText().toString());
                m24 = Integer.parseInt(c24.getText().toString());
                m31 = Integer.parseInt(c31.getText().toString());
                m32 = Integer.parseInt(c32.getText().toString());
                m33 = Integer.parseInt(c33.getText().toString());
                m34 = Integer.parseInt(c34.getText().toString());
                m41 = Integer.parseInt(c41.getText().toString());
                m42 = Integer.parseInt(c42.getText().toString());
                m43 = Integer.parseInt(c43.getText().toString());
                m44 = Integer.parseInt(c44.getText().toString());
                n11 = Integer.parseInt(s11.getText().toString());
                n12 = Integer.parseInt(s12.getText().toString());
                n13 = Integer.parseInt(s13.getText().toString());
                n14 = Integer.parseInt(s14.getText().toString());
                n21 = Integer.parseInt(s21.getText().toString());
                n22 = Integer.parseInt(s22.getText().toString());
                n23 = Integer.parseInt(s23.getText().toString());
                n24 = Integer.parseInt(s24.getText().toString());
                n31 = Integer.parseInt(s31.getText().toString());
                n32 = Integer.parseInt(s32.getText().toString());
                n33 = Integer.parseInt(s33.getText().toString());
                n34 = Integer.parseInt(s34.getText().toString());
                n41 = Integer.parseInt(s41.getText().toString());
                n42 = Integer.parseInt(s42.getText().toString());
                n43 = Integer.parseInt(s43.getText().toString());
                n44 = Integer.parseInt(s44.getText().toString());

                mat11=m11 + n11;
                mat12=m12 + n12;
                mat13=m13 + n13;
                mat14=m14 + n14;
                mat21=m21 + n21;
                mat22=m22 + n22;
                mat23=m23 + n23;
                mat24=m24 + n24;
                mat31=m31 + n31;
                mat32=m32 + n32;
                mat33=m33 + n33;
                mat34=m34 + n34;
                mat41=m41 + n41;
                mat42=m42 + n42;
                mat43=m43 + n43;
                mat44=m44 + n44;


                Intent intent = new Intent(SumMatrix4x4.this, SumMatrixRes4x4.class);
                intent.putExtra("mat11", mat11);
                intent.putExtra("mat12", mat12);
                intent.putExtra("mat13", mat13);
                intent.putExtra("mat14", mat14);
                intent.putExtra("mat21", mat21);
                intent.putExtra("mat22", mat22);
                intent.putExtra("mat23", mat23);
                intent.putExtra("mat24", mat24);
                intent.putExtra("mat31", mat31);
                intent.putExtra("mat32", mat32);
                intent.putExtra("mat33", mat33);
                intent.putExtra("mat34", mat34);
                intent.putExtra("mat41", mat41);
                intent.putExtra("mat42", mat42);
                intent.putExtra("mat43", mat43);
                intent.putExtra("mat44", mat44);
                startActivity(intent);

            }
        });

    }

    }
