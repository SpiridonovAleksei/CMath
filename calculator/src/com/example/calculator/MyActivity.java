package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnMainCalculator = (Button) findViewById(R.id.MainCalculator);
        btnMainCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                Intent intent = new Intent(MyActivity.this, MainCalculator.class);
                startActivity(intent);

            }
        });
        Button SquareRoot = (Button) findViewById(R.id.SquareEquation);
        SquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.
                Intent intent = new Intent(MyActivity.this, SquareEquation.class);
                startActivity(intent);

            }
        });
        Button BiquadraticEquation = (Button) findViewById(R.id.BiquadraticEquation);
        BiquadraticEquation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                Intent intent = new Intent(MyActivity.this, BiquadraticEquation.class);
                startActivity(intent);
            }
        });
        Button Matrix = (Button) findViewById(R.id.Matrix);
        Matrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                Intent intent = new Intent(MyActivity.this, Matrix2x2.class);
                startActivity(intent);
            }
        });

        Button SumMatrix = (Button) findViewById(R.id.SumMatrix);
        SumMatrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                Intent intent = new Intent(MyActivity.this, SumMatrix2x2.class);
                startActivity(intent);


            }
        });

        Button surface = (Button) findViewById(R.id.Surface);
        surface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                Intent intent = new Intent(MyActivity.this, Surface.class);
                startActivity(intent);

            }
        });

        Button EquationOfTheLine = (Button) findViewById(R.id.EquationOfTheLine);
        EquationOfTheLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.

                Intent intent = new Intent(MyActivity.this, EquationOfTheLine.class);
                startActivity(intent);

            }
        });

    }
}
