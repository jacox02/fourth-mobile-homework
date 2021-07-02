package com.jackecxzerotwo.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PlatesActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {
    String[] VeganTypes = {"Tortilla de patatas vegana", "Revuelto vegano de tofu", "Falafel ligero", "Tortilla jugosa vegana de calabacín", "Curry de garbanzos con mango"};
    String[] PostresTypes = {"Budin de pan casero", "Bartolillos madrileños", "Mousse de limón", "Receta de pastel lava", "Strudel de fresa"};
    String[] PastasTypes = {"Pasta con salsa verde", "Pasta con atún", "Pasta con chorizo", "Coditos con salsa cremosa", "Macarrones con queso y espinaca"};
    String[] CakesTypes = {"Tarta de zanahoria", "Tarta de queso fácil", "Coca de San Juan de chocolate", "Pastel de 3 leches", "Cupcakes de chocolate"};
    String[] MexicafoodTypes = {"Tostadas de salpicón", "Tacos de milanesa de pollo", "Sándwich de nopal con jamón y queso", "Arroz blanco con elote y chile poblano", "Tortitas de papa con jamón"};


    String selectedFood = "Tostadas de salpicón";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plates);

        Spinner recipesTypesSpinner;
        recipesTypesSpinner =  findViewById(R.id.spinnerRecipes);
        ArrayAdapter<String> recipeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, MexicafoodTypes);
        recipesTypesSpinner.setAdapter(recipeAdapter);
        recipesTypesSpinner.setOnItemSelectedListener(this);

        switch (getIntent().getStringExtra("RecipeType")){
            case "Comida Vegana":
                ArrayAdapter<String> veganAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, VeganTypes);
                recipesTypesSpinner.setAdapter(veganAdapter);
                break;
            case "Postres":
                ArrayAdapter<String> postreAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, PostresTypes);
                recipesTypesSpinner.setAdapter(postreAdapter);
                break;
            case "Pastas":ArrayAdapter<String> pastasAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, PastasTypes);
                recipesTypesSpinner.setAdapter(pastasAdapter);
                break;
            case "Pasteles":ArrayAdapter<String> pastelesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, CakesTypes);
                recipesTypesSpinner.setAdapter(pastelesAdapter);
                break;
        }
    }
    public void seeRecipe(View view){
        Intent seeRecipeIntent = new Intent(this, FoodRecipe.class);
        seeRecipeIntent.putExtra("SelectedFood",selectedFood);
        startActivity(seeRecipeIntent);
    }
    public void getBack(View view){
        Intent getBack = new Intent(this, MainActivity.class);
        startActivity(getBack);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selectedFood = parent.getItemAtPosition(position).toString();
        Log.d("SELECTED FOOD", "onItemSelected: " + selectedFood);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}