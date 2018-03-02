package com.example.android.inclassassignment06_vilmariet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewTwo = findViewById(R.id.second_activity_window);


        Intent receiveIntent = getIntent();

        Drinks need = (Drinks) receiveIntent.getSerializableExtra(Keys.DRINKS);
        //Drinks need = (Drinks) receiveIntent.getSerializableExtra("drinkUp");


        textViewTwo.setText(need.toString());
        //textViewTwo.setText(need.getIngredients());
        //textViewTwo.setText(need.getDrinkName());


    }
}
