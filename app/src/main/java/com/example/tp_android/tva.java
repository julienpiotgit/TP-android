package com.example.tp_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class tva extends AppCompatActivity {

    private int prix;
    private String rien = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tva);
    }

    public void clique(View v){
        EditText valeur = (EditText)findViewById(R.id.valeur);

        int prix = (int) Integer.parseInt(valeur.getText().toString());
        calcul(prix);
        valeur.setText(""+rien);
    }

    public int calcul(int prix){
        Log.i("le prix est:",""+prix);
        double tva = prix * 1.20;
        Log.i("la tva est:",""+tva);
        TextView result = (TextView) findViewById(R.id.result);
        result.setText("Voici le résultat : "+prix+" * 1.20(soit 20%) = "+tva);
        return prix;
    }
}
