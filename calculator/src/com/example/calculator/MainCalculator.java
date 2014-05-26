package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Константин
 * Date: 09.04.14
 * Time: 15:31
 * To change this template use File | Settings | File Templates.
 */
public class MainCalculator extends Activity {

    ArrayList<Float> mathVariables = new ArrayList<Float>();
    float mathVariable1;
    float mathVariable2;

    int currentOperation = 0;
    int nextOperation;

    final static int ADD = 1;
    final static int SUBTRACT = 2;
    final static int MULTIPLY = 3;
    final static int DIVISION = 4;
    final static int EQUALS = 5;
    final static int SQRT = 6;

    final static int CLEAR = 1;
    final static int DONT_CLEAR = 0;
    int clearCalcDisplay = 0;


     EditText display ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maincalculator);



        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button zero = (Button) findViewById(R.id.zero);
        Button subtract = (Button) findViewById(R.id.subtract);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button division = (Button) findViewById(R.id.division);
        Button equals = (Button) findViewById(R.id.equals);
        Button addition = (Button) findViewById(R.id.addition);
        Button decimal = (Button) findViewById(R.id.decimal);
        Button clear = (Button) findViewById(R.id.clear);
        display = (EditText) findViewById(R.id.EditText);


        clear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                display.setText("");
                mathVariable1 = 0;
                mathVariable2 = 0;
                mathVariables.removeAll(mathVariables);
                currentOperation = 0;
                nextOperation = 0;
            }
        });


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                if (clearCalcDisplay == CLEAR) {
                    display.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                display.append("1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                if (clearCalcDisplay == CLEAR) {
                    display.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                display.append("2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                if (clearCalcDisplay == CLEAR) {
                    display.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                display.append("3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                if (clearCalcDisplay == CLEAR) {
                    display.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                display.append("4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                if (clearCalcDisplay == CLEAR) {
                    display.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                display.append("5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                if (clearCalcDisplay == CLEAR) {
                    display.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                display.append("6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                if (clearCalcDisplay == CLEAR) {
                    display.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                display.append("7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                if (clearCalcDisplay == CLEAR) {
                    display.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                display.append("8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                if (clearCalcDisplay == CLEAR) {
                    display.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                display.append("9");

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearCalcDisplay == CLEAR) {
                    display.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                display.append("0");

            }
        });

     addition.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             //To change body of implemented methods use File | Settings | File Templates.

             calcLogic(ADD);

         }
     });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                calcLogic(SUBTRACT);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                calcLogic(MULTIPLY);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                calcLogic(DIVISION);
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                if (clearCalcDisplay == CLEAR) {
                    display.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                display.append(".");
            }
        });

    equals.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //To change body of implemented methods use File | Settings | File Templates.

            calcLogic(EQUALS);
        }
    });


    }

    private void calcLogic(int operator) {

        mathVariables.add(Float.parseFloat(display.getText().toString()));

        if (operator != EQUALS) {
            nextOperation = operator;
        }else if (operator == EQUALS){
            nextOperation = 0;
        }

        switch (currentOperation) {
            case ADD:
                mathVariable1 = mathVariables.get(0);
                mathVariable2 = mathVariables.get(1);

                mathVariables.removeAll(mathVariables);

                mathVariables.add(mathVariable1 + mathVariable2);

                display.setText(String.format("%.3f", mathVariables.get(0)));
                break;
            case SUBTRACT:
                mathVariable1 = mathVariables.get(0);
                mathVariable2 = mathVariables.get(1);

                mathVariables.removeAll(mathVariables);

                mathVariables.add(mathVariable1 - mathVariable2);

                display.setText(String.format("%.3f", mathVariables.get(0)));
                break;
            case MULTIPLY:
                mathVariable1 = mathVariables.get(0);
                mathVariable2 = mathVariables.get(1);

                mathVariables.removeAll(mathVariables);

                mathVariables.add(mathVariable1 * mathVariable2);

                display.setText(String.format("%.3f", mathVariables.get(0)));
                break;
            case DIVISION:
                mathVariable1 = mathVariables.get(0);
                mathVariable2 = mathVariables.get(1);

                mathVariables.removeAll(mathVariables);

                mathVariables.add(mathVariable1 / mathVariable2);

                display.setText(String.format("%.3f", mathVariables.get(0)));
                break;
                    }

        clearCalcDisplay = CLEAR;
        currentOperation = nextOperation;
        if (operator == EQUALS) {
            mathVariable1 = 0;
            mathVariable2 = 0;
            mathVariables.removeAll(mathVariables);
        }


    }


}
