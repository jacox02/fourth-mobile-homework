package com.jackecxzerotwo.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String type = "Mexican Food";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Categorias de comida spinnerRecipesFoodTypes
        String[] foodTypes = {"Comida Mexicana", "Comida Vegana", "Postres", "Pastas", "Pasteles"};
        Spinner foodTypesSpinner;
        foodTypesSpinner = findViewById(R.id.spinnerRecipesFoodTypes);

        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, foodTypes);
        foodTypesSpinner.setAdapter(adapter);
        foodTypesSpinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        String selectedFoodType = parent.getItemAtPosition(pos).toString();
        if (selectedFoodType == "Comida Mexicana"){
            type = "Comida Mexicana";
        }else if(selectedFoodType == "Comida Vegana"){
            type = "Comida Vegana";
        }else if(selectedFoodType == "Postres"){
            type = "Postres";
        }else if(selectedFoodType == "Pastas"){
            type = "Pastas";
        }else if(selectedFoodType == "Pasteles"){
            type = "Pasteles";
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        type = "Comida Mexicana";
    }

    public void seePlates(View view){
        Intent seePlates =  new Intent(this, PlatesActivity.class);
        Log.d("A", "seePlates: " + type);
        seePlates.putExtra("RecipeType", type);
        startActivity(seePlates);
    }
}