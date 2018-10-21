package com.example.ugr.museo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_animales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_animales);
    }


    public void Aniima1_llamar(View view) {
        Intent intent = new Intent(this, Animal.class);
        startActivity(intent);
    }
}
