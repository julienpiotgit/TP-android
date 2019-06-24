package com.example.tp_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculatrice extends AppCompatActivity {

    EditText number1, number2;
    TextView resultat;
    Button addition,soustraction,multiplier,diviser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);

        resultat = (TextView)findViewById(R.id.resultat);

        addition = (Button)findViewById(R.id.addition);
        soustraction = (Button)findViewById(R.id.soustraction);
        multiplier = (Button)findViewById(R.id.multiplier);
        diviser = (Button)findViewById(R.id.diviser);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(number1.getText() != null && number2.getText() != null){

                    double n1 = Double.parseDouble(number1.getText().toString());
                    double n2 = Double.parseDouble(number2.getText().toString());

                    double result = n1 + n2;
                    resultat.setText(String.valueOf(result));
                }else{
                    Toast.makeText(view.getContext(),"Entrer un nombre",Toast.LENGTH_SHORT).show();
                }

            }
        });

        soustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number1.getText() != null && number2.getText() != null){

                    double n1 = Double.parseDouble(number1.getText().toString());
                    double n2 = Double.parseDouble(number2.getText().toString());

                    double result = n1 - n2;
                    resultat.setText(String.valueOf(result));
                }else{
                    Toast.makeText(view.getContext(),"Entrer un nombre",Toast.LENGTH_SHORT).show();
                }
            }
        });

        multiplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number1.getText() != null && number2.getText() != null){

                    double n1 = Double.parseDouble(number1.getText().toString());
                    double n2 = Double.parseDouble(number2.getText().toString());

                    double result = n1 * n2;
                    resultat.setText(String.valueOf(result));
                }else{
                    Toast.makeText(view.getContext(),"Entrer un nombre",Toast.LENGTH_SHORT).show();
                }
            }
        });

        diviser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number1.getText() != null && number2.getText() != null){

                    double n1 = Double.parseDouble(number1.getText().toString());
                    double n2 = Double.parseDouble(number2.getText().toString());

                    double result = n1 / n2;
                    resultat.setText(String.valueOf(result));
                }else{
                    Toast.makeText(view.getContext(),"Entrer un nombre",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}