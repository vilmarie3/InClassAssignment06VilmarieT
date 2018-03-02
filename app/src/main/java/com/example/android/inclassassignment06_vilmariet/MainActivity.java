package com.example.android.inclassassignment06_vilmariet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    EditText drinkName;
    EditText baseAlcohol;
    CheckBox ice;
    EditText ingredients;

    //was going to have a spinner, but time constraints did not allow me to explore this idea within the java file

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drinkName = findViewById(R.id.drink_name);
        baseAlcohol = findViewById(R.id.alcohol_choices);
        ice = findViewById(R.id.ice);
        ingredients = findViewById(R.id.number_ingredients);
    }


    public void launchActivity(View view) {

        String drinkNameMessage = drinkName.getText().toString();
        String baseAlcoholMessage = baseAlcohol.getText().toString();
        String ingredientMessage = ingredients.getText().toString();


        boolean hasIce = ice.isChecked();


        Intent intent = new Intent(this, SecondActivity.class);

        Drinks yummy = new Drinks(drinkNameMessage, baseAlcoholMessage, hasIce, ingredientMessage);

        intent.putExtra(Keys.DRINKS, yummy);
        //intent.putExtra("drinkUp", yummy);
        startActivity(intent);


    }
}
