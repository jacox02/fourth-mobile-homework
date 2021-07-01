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
    String[] VeganTypes = {"Tortilla de patatas vegana", "Revuelto vegano de tofu", "Falafel ligero", "Tortilla jugosa vegana de calabacín", "Curry de garbanzos con mango"};
    String[] PostresTypes = {"Budin de pan casero", "Bartolillos madrileños", "Mousse de limón", "Receta de pastel lava", "Strudel de fresa"};
    String[] PastasTypes = {"Pasta con salsa verde", "Pasta con atún", "Pasta con chorizo", "Coditos con salsa cremosa", "Macarrones con queso y espinaca"};
    String[] CakesTypes = {"Tarta de zanahoria", "Tarta de queso fácil", "Coca de San Juan de chocolate", "Pastel de 3 leches", "Cupcakes de chocolate"};
    String[] MexicafoodTypes = {"", "", "", "", ""};

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

        //Platillos de la categoria seleccionada
        Spinner recipesTypesSpinner;
        recipesTypesSpinner =  findViewById(R.id.spinnerRecipes);
        ArrayAdapter<String> recipeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, MexicafoodTypes);
        recipesTypesSpinner.setAdapter(recipeAdapter);

        foodTypesSpinner.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        Log.d("Seleccionado", parent.getItemAtPosition(pos).toString());
        String selectedFoodType = parent.getItemAtPosition(pos).toString();
       Spinner recipesTypesSpinner = findViewById(R.id.spinnerRecipes);
        if (selectedFoodType == "Comida Mexicana"){
            ArrayAdapter<String> mexicanAdapter =  new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, MexicafoodTypes);
            recipesTypesSpinner.setAdapter(mexicanAdapter);
        }else if(selectedFoodType == "Comida Vegana"){
            ArrayAdapter<String> veganAdapter =  new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, VeganTypes);
            recipesTypesSpinner.setAdapter(veganAdapter);
        }else if(selectedFoodType == "Postres"){
            ArrayAdapter<String> postresAdapter =  new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, PostresTypes);
            recipesTypesSpinner.setAdapter(postresAdapter);
        }else if(selectedFoodType == "Pastas"){
            ArrayAdapter<String> pastasAdapter =  new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, PastasTypes);
            recipesTypesSpinner.setAdapter(pastasAdapter);
        }else if(selectedFoodType == "Pasteles"){
            ArrayAdapter<String> cakesAdapter =  new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, CakesTypes);
            recipesTypesSpinner.setAdapter(cakesAdapter);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}