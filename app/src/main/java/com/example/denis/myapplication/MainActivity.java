package com.example.denis.myapplication;
//N'oubliez pas de déclarer le bon package dans lequel se trouve le fichier !
// nouvelle version

import android.app.Activity;

import android.os.Bundle;

import android.widget.TextView;


public class MainActivity extends Activity {

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        String applicationName = getResources().getString(R.string.app_name);

        // Au lieu d'afficher "My Application" on va afficher "My way !"

        applicationName = applicationName.replace("Application", "way !");


        TextView view = new TextView(this);

        view.setText(applicationName);


        setContentView(view);

    }

}