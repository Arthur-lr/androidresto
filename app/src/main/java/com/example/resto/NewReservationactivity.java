package com.example.resto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.resto.Modele.Reservation;


public class NewReservationactivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newreservationactivity);

        //programmation des boutons enregistrer et quitter
        Button btnreserver = findViewById(R.id.btnreserver);


        //récupération des données saisies
        final EditText nomresto = findViewById(R.id.editTextrestau);

        final EditText nomreservation = findViewById(R.id.editTextreservation);

        final EditText nbpers = findViewById(R.id.editTextnbpersonnes);

        final EditText emplacement = findViewById(R.id.editTextEmplacement);

        final EditText jour = findViewById(R.id.editTextjour);

        final EditText heure = findViewById(R.id.edittextHeure);

        //on place un écouteur dessus
        View.OnClickListener ecouteur = new View.OnClickListener() {
            //on implémente la méthode onclick
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnreserver:
                        Toast.makeText(getApplicationContext(), "enregistrement du nouveau client !", Toast.LENGTH_LONG).show();
                        Reservation unReservation = new Reservation(nomreservation.getText().toString(), nomresto.getText().toString(), nbpers.getText().toString(), emplacement.getText().toString(), jour.getText().toString(), heure.getText().toString());

                        //le curseur pour afficher le nombre de clients dans la base



                        finish();
                        break;
                    case R.id.btnannuler:
                        finish();
                        break;

                }
            }
        };
        //on affecte au bouton l'écouteur
        btnreserver.setOnClickListener(ecouteur);
    }
}

