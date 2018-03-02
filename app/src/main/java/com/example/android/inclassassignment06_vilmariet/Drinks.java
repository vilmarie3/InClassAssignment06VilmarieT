package com.example.android.inclassassignment06_vilmariet;

import java.io.Serializable;

/**
 * Created by vilmarietaraza on 3/1/18.
 */



public class Drinks implements Serializable {
    public String drinkName;
    public String alcoholBase;
    public boolean ice;
    public String ingredients;

    public Drinks(String drinkName, String alcoholBase, boolean ice, String ingredients){
        this.alcoholBase = alcoholBase;
        this.drinkName = drinkName;
        this.ice = ice;
        this.ingredients = ingredients;
    }

    public void setDrinkName(String drinkName){
        this.drinkName = drinkName;
    }

    public String getDrinkName(){
        return drinkName;
    }

    public void setAlcoholBase(String alcoholBase){
        this.alcoholBase = alcoholBase;
    }

    public String getAlcoholBase(){
        return alcoholBase;
    }

    public void isIce(boolean ice){
        this.ice = ice;
    }

    public boolean getIce(){
        return ice;
    }

    public void setIngredients(String ingredients){
        this.ingredients = ingredients;
    }

    public String getIngredients(){
        return ingredients;
    }


    public String toString(){
        return "Spiked Android Bar \nDrink name: " + drinkName + "\nAlcohol Base: " + alcoholBase + "\nOn the rocks?: " + ice + "\nAdditional ingredients:" + ingredients;
    }
}
