package com.example.resto.Modele;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import static com.example.resto.Modele.StructureBDD.*;
import static com.example.resto.Modele.StructureBDD.;
import com.example.resto.Modele.DAOModele;

public class DAOReservation extends DAOModele {


    public DAOReservation(Context context) {
       super(context);
    }

    public long insererClient (com.example.resto.Modele.Reservation unReservation){
        //Création d'un ContentValues (fonctionne comme une HashMap)
        ContentValues values = new ContentValues();
        //on lui ajoute une valeur associé à une clé (qui est le nom de la colonne où on veut mettre la valeur)
        values.put(COL_NOMRESTO, unReservation.getNomresto());
        values.put(COL_NOMRESERVATION, unReservation.getNomreservation());
        values.put(COL_NBPERSONNES, unReservation.getNbpersonnes());
        values.put(COL_EMPLACEMENT, unReservation.getEmplacement());
        values.put(COL_JOUR, unReservation.getJour());
        values.put(COL_HEURE, unReservation.getHeure());
        //on insère l'objet dans la BDD via le ContentValues
        return db.insert(TABLE_RESERVATION, null, values);
    }

    public Cursor getDataClient(){

        return db.rawQuery("SELECT * FROM treservation", null);
    }
}
