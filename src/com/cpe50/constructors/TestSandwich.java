package com.cpe50.constructors;

public class TestSandwich {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        Sandwich sandwich1 = new Sandwich("Bacon");
        Sandwich sandwich2 = new Sandwich("Bacon","Plain");
        Sandwich sandwich3 = new Sandwich("Bacon","Plain",2.99);

        display(sandwich);
        display(sandwich1);
        display(sandwich2);
        display(sandwich3);
    }

    public  static void display(Sandwich sandwich)
    {
        System.out.println("Main Ingredient : " + sandwich.getMainIngredient());
        System.out.println("Bread Type : " + sandwich.getBreadType());
        System.out.println("Price : " + sandwich.getPrice());

    }
}
