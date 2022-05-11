package com.example.resto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnNewReservation = findViewById(R.id.btnreservation);

        //on place un écouteur dessus
        View.OnClickListener ecouteur = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnreservation:
                        Intent intent1 = new Intent(MainActivity.this, NewReservationactivity.class);
                        startActivity(intent1);
                        break;
                }
            }
        };



        //on affecte au bouton l'écouteur
        btnNewReservation.setOnClickListener(ecouteur);
    }
}