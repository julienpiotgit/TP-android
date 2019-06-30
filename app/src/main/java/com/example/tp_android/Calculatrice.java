package com.example.tp_android;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculatrice extends AppCompatActivity {

    private Calculatrice activity;
    EditText number1, number2;
    TextView resultat;
    Button addition,soustraction,multiplier,diviser,effacer;
    private String rien = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);

        this.activity = this;

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);

        //resultat = (TextView)findViewById(R.id.resultat);

        addition = (Button)findViewById(R.id.addition);
        soustraction = (Button)findViewById(R.id.soustraction);
        multiplier = (Button)findViewById(R.id.multiplier);
        diviser = (Button)findViewById(R.id.diviser);

        effacer = (Button)findViewById(R.id.effacer);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(number1 == null && number2 == null){
                    Toast.makeText(getApplicationContext(),"Les champs sont vide",Toast.LENGTH_LONG).show();
                }else{
                double n1 = Double.parseDouble(number1.getText().toString());
                double n2 = Double.parseDouble(number2.getText().toString());
                double result = n1 + n2;

                //resultat.setText(String.valueOf(result));

                AlertDialog.Builder popup = new AlertDialog.Builder(activity);
                popup.setTitle("Résultat");
                popup.setMessage("Voici votre calcul : " + n1 + " + " + n2 + " = " + result);
                popup.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Toast.makeText(getApplicationContext(),"test",Toast.LENGTH_LONG).show();
                    }
                });
                popup.show();
                //number1.setText(rien);
                //number2.setText(rien);
            }}
        });

        soustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number1 == null && number2 == null){
                    Toast.makeText(getApplicationContext(),"Les champs sont vide",Toast.LENGTH_LONG).show();
                }else{
                double n1 = Double.parseDouble(number1.getText().toString());
                double n2 = Double.parseDouble(number2.getText().toString());
                double result = n1 - n2;

                //resultat.setText(String.valueOf(result));

                AlertDialog.Builder popup = new AlertDialog.Builder(activity);
                popup.setTitle("Résultat");
                popup.setMessage("Voici votre calcul : "+ n1 +" - " + n2 + " = " + result);
                popup.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Toast.makeText(getApplicationContext(),"test",Toast.LENGTH_LONG).show();
                    }
                });
                popup.show();
                //number1.setText(rien);
                //number2.setText(rien);
            }}
        });

        multiplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number1 == null && number2 == null){
                    Toast.makeText(getApplicationContext(),"Les champs sont vide",Toast.LENGTH_LONG).show();
                }else{
                double n1 = Double.parseDouble(number1.getText().toString());
                double n2 = Double.parseDouble(number2.getText().toString());
                double result = n1 * n2;

                //resultat.setText(String.valueOf(result));

                AlertDialog.Builder popup = new AlertDialog.Builder(activity);
                popup.setTitle("Résultat");
                popup.setMessage("Voici votre calcul : "+ n1 +" * " + n2 + " = " + result);
                popup.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Toast.makeText(getApplicationContext(),"test",Toast.LENGTH_LONG).show();
                    }
                });
                popup.show();
                //number1.setText(rien);
                //number2.setText(rien);
            }}
        });

        diviser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number1 == null && number2 == null){
                    Toast.makeText(getApplicationContext(),"Les champs sont vide",Toast.LENGTH_LONG).show();
                }else{
                double n1 = Double.parseDouble(number1.getText().toString());
                double n2 = Double.parseDouble(number2.getText().toString());
                double result = n1 / n2;

                //resultat.setText(String.valueOf(result));

                AlertDialog.Builder popup = new AlertDialog.Builder(activity);
                popup.setTitle("Résultat");
                popup.setMessage("Voici votre calcul : "+ n1 +" / " + n2 + " = " + result);
                popup.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Toast.makeText(getApplicationContext(),"test",Toast.LENGTH_LONG).show();
                    }
                });
                popup.show();
                //number1.setText(rien);
                //number2.setText(rien);
            }}
        });

        effacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1 == null && number2 == null) {
                    Toast.makeText(getApplicationContext(), "Les champs sont déjà vide", Toast.LENGTH_LONG).show();
                } else {
                    number1.setText(String.valueOf(rien));
                    number2.setText(String.valueOf(rien));
                }
            }
        });
    }
}