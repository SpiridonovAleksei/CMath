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
 * Time: 12:33
 * To change this template use File | Settings | File Templates.
 */
public class Surface extends Activity {

    int a11,a12,a13,a22,a23,a33,a10,a20,a30,a00, det1, det2, det3, det4;
    int res, res1,res2,res3;
    int k1,k2;
    int b,c,d;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surface);

        final EditText text11 = (EditText) findViewById(R.id.txt11);
        final EditText text12 = (EditText) findViewById(R.id.txt12);
        final EditText text13 = (EditText) findViewById(R.id.txt13);
        final EditText text22 = (EditText) findViewById(R.id.txt22);
        final EditText text23 = (EditText) findViewById(R.id.txt23);
        final EditText text33 = (EditText) findViewById(R.id.txt33);
        final EditText text10 = (EditText) findViewById(R.id.txt10);
        final EditText text20 = (EditText) findViewById(R.id.txt20);
        final EditText text30 = (EditText) findViewById(R.id.txt30);
        final EditText text00 = (EditText) findViewById(R.id.txt00);
        final TextView txtresult = (TextView) findViewById(R.id.txtresult);


        Button result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                a11 = Integer.parseInt(text11.getText().toString());
                a12 = Integer.parseInt(text12.getText().toString());
                a13 = Integer.parseInt(text13.getText().toString());
                a22 = Integer.parseInt(text22.getText().toString());
                a23 = Integer.parseInt(text23.getText().toString());
                a33 = Integer.parseInt(text33.getText().toString());
                a10 = Integer.parseInt(text10.getText().toString());
                a20 = Integer.parseInt(text20.getText().toString());
                a30 = Integer.parseInt(text30.getText().toString());
                a00 = Integer.parseInt(text00.getText().toString());

                res =  (a22*a33*a00) + (((a23)/2)*((a30)/2)*((a20)/2)) + (((a23)/2)*((a30)/2)*((a20)/2)) - (((a20)/2)*a33*((a20)/2)) - (((a23)/2)*((a23)/2)*a00) - (a22*((a30)/2)*((a30)/2));
                res1 = (((a12)/2)*a33*a00) + (((a23)/2)*((a30)/2)*((a10)/2)) + (((a13)/2)*((a30)/2)*a00) - (((a10)/2)*a33*((a20)/2)) - (((a23)/2)*((a13)/2)*a00) - (((a12)/2)*((a30)/2)*((a30)/2));
                res2 = (((a12)/2)*((a23)/2)*a00) + (a22*((a30)/2)*((a10)/2)) + (((a13)/2)*((a20)/2)*a00) - (((a10)/2)*((a23)/2)*((a20)/2)) - (a22*((a13)/2)*a00) - (((a12)/2)*((a30)/2)*((a20)/2));
                res3 = (((a12)/2)*((a23)/2)*((a30)/2)) + (a22*a33*((a10)/2)) + (((a13)/2)*((a20)/2)*((a23)/2)) - (((a10)/2)*((a23)/2)*((a23)/2)) - (a22*((a13)/2)*((a30)/2)) - (((a12)/2)*a33*((a20)/2));
                det4 = (a11*res) - (((a12)/2)*res1) + (((a13)/2)*res2) - (((a10)/2)*res3);

                det3 = (a11*a22*a33) + (((a12)/2)*((a23)/2)*((a13)/2)) + (((a12)/2)*((a23)/2)*((a13)/2)) - (((a13)/2)*a22*((a13)/2)) - (((a12)/2)*((a12)/2)*a33) - (a11*((a23)/2)*((a23)/2));

                det2 = ((a11*a22) - (((a12)/2)*((a12)/2))) + ((a11*a33) - (((a13)/2)*((a13)/2))) + ((a22*a33) - (((a23)/2)*((a23)/2)));

                det1 = a11 + a22 + a33;

                k1 = ((a11*a00) - (((a10)/2)*((a10)/2))) + ((a22*a00) - (((a20)/2)*((a20)/2))) + ((a33*a00) - (((a30)/2)*((a30)/2)));

                b = (a11*a22*a00) + (((a12)/2)*((a20)/2)*((a10)/2)) + (((a12)/2)*((a20)/2)*((a10)/2)) - (((a10)/2)*a22*((a10)/2)) - (((a12)/2)*((a12)/2)*a00) - (a11*((a10)/2)*((a20)/2));
                c = (a11*a33*a00) + (((a13)/2)*((a30)/2)*((a10)/2)) + (((a13)/2)*((a30)/2)*((a10)/2)) - (((a10)/2)*a33*((a10)/2)) - (((a13)/2)*((a13)/2)*a00) - (a11*((a30)/2)*((a30)/2));
                d = (a22*a33*a00) + (((a23)/2)*((a30)/2)*((a20)/2)) + (((a23)/2)*((a30)/2)*((a20)/2)) - (((a20)/2)*a33*((a20)/2)) - (((a23)/2)*((a23)/2)*a00) - (a22*((a30)/2)*((a30)/2));

                k2 = b + c + d;

                if(det3 == 0){

                    if(det4 > 0) {
                         txtresult.setText("Так как D3 =" + det3 + " и D4>0 => гипербалический парабалоид");
                    }
                    if (det4 < 0){
                        txtresult.setText("Так как D3 =" + det3 + " и D4<0 => эллиптический парабалоид");
                                            }
                    if (det4 == 0) {
                        if(det2 > 0){
                            if((det1 * k2) < 0) {
                                txtresult.setText("Так как D3 =" + det3 + " и D4=0 => параболический тип => т.к D2 > 0 и D1*k2<0 => эллиптический циллиндр");
                            }
                            if((det1 * k2) > 0) {
                                txtresult.setText("Так как D3 =" + det3 + " и D4=0 => параболический тип => т.к D2 > 0 и D1*k2>0 => мнимый эллиптический циллиндр");
                            }
                            if(k2 == 0){
                                txtresult.setText("Так как D3 =" + det3 + " и D4=0 => параболический тип => т.к D2 > 0 и k2=0 => пара мнимых пересекающихся плоскостей");
                            }
                        }

                        if(det2 < 0){
                            if(k2 != 0){
                                txtresult.setText("Так как D3 =" + det3 + " и D4=0 => параболический тип => т.к D2 < 0 и k2<>0 => гиперболический цилиндр");
                            }

                            if(k2 == 0){
                                txtresult.setText("Так как D3 =" + det3 + " и D4=0 => параболический тип => т.к D2 < 0 и k2=0 => пара пересекающихся плоскостей");
                            }

                        }
                        if(det2 == 0){
                            if(k2 != 0){
                                txtresult.setText("Так как D3 =" + det3 + " и D4=0 => параболический тип => т.к D2 = 0 и k2<>0 => параболический циллиндр");
                            }

                            if(k2 == 0){
                                if(k1 < 0){
                                    txtresult.setText("Так как D3 =" + det3 + " и D4=0 => параболический тип => т.к D2 = 0 и k2=0 и k1<0 => пара параллельных плоскостей");
                                }
                                if(k1 > 0){
                                    txtresult.setText("Так как D3 =" + det3 + " и D4=0 => параболический тип => т.к D2 = 0 и k2=0 и k1>0 => пара мнимых параллельных плоскостей");
                                }
                                if(k1 == 0){
                                    txtresult.setText("Так как D3 =" + det3 + " и D4=0 => параболический тип => т.к D2 = 0 и k2=0 и k1=0 => пара совпадающих плоскостей");
                                }
                            }

                        }
                    }

                }
                if (det3!= 0) {
                    if((det1*det3) > 0 && det2 > 0) {
                        if(det4 < 0){
                            txtresult.setText("Так как D1*D3>0 и D2>0  => эллиптический тип, а так как D4 < 0 => эллипсоид");

                        }

                        if(det4 > 0) {
                            txtresult.setText("Так как D1*D3>0 и D2>0  => эллиптический тип, а так как D4 > 0 =>мнимый  эллипсоид");
                        }

                        if (det4 == 0) {
                            txtresult.setText("Так как D1*D3>0 и D2>0  => эллиптический тип, а так как D4 = 0 => мнимый конус");
                        }
                    }

                    if((det1*det3)<= 0 && det2 <= 0){

                        if(det4>0){
                            txtresult.setText("Так как D1*D3<=0 и D2<=0  => гиперболический тип, а так как D4 > 0 => однополостный гиперболоид");
                        }

                        if(det4 < 0){
                            txtresult.setText("Так как D1*D3<=0 и D2<=0  => гиперболический тип, а так как D4 < 0 => двуполостный гиперболоид");
                        }
                        if(det4 == 0){
                            txtresult.setText("Так как D1*D3<=0 и D2<=0  => гиперболический тип, а так как D4 = 0 => конус");
                        }

                    }
                }


            }
        });

    }
}
