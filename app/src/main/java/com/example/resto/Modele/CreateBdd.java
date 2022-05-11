package com.example.resto.Modele;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CreateBdd extends SQLiteOpenHelper {
    private static final String TABLE_RESERVATION = "treservation";
    static final String COL_IDRESERVATION = "_id";
    private static final String COL_NOMRESTO = "NomResto";
    private static final String COL_NOMRESERVATION = "NomReservation";
    private static final String COL_NBPERSONNES = "NbPersonnes";
    private static final String COL_EMPLACEMENT = "Emplacement";
    private static final String COL_JOUR = "Jour";
    private static final String COL_HEURE = "Heure";

    private static final String CREATE_TABLERESERVATION = "CREATE TABLE " + TABLE_RESERVATION + " ("+COL_IDRESERVATION+" INTEGER PRIMARY KEY AUTOINCREMENT,"+ COL_NOMRESTO + " TEXT NOT NULL, " + COL_NOMRESERVATION + " TEXT NOT NULL, " + COL_NBPERSONNES + " TEXT NOT NULL," + COL_EMPLACEMENT + " TEXT NOT NULL," + COL_JOUR + " TEXT NOT NULL," + COL_HEURE + " TEXT NOT NULL);";

    public CreateBdd(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    //méthodes d'instance permettant la gestion de l'objet
    @Override
    public void onCreate(SQLiteDatabase db) {
        //appelée lorsqu’aucune base n’existe et que la classe utilitaire doit en créer une
        //on créé la table à partir de la requête écrite dans la variable CREATE_BDD
        db.execSQL(CREATE_TABLERESERVATION);

    }
    // appelée si la version de la base a changé
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //On peut  supprimer la table et de la recréer
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RESERVATION + ";");
        onCreate(db);
    }
}
