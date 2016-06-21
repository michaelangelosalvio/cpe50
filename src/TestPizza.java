import java.util.Scanner;

/**
 * Created by msalvio on 21/06/16.
 */
public class TestPizza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pizza p1 = new Pizza();
        System.out.println("Enter Toppings:");
        p1.setToppings(input.nextLine());

        System.out.println("Enter Diameter:");
        p1.setDiameter(input.nextInt());

        System.out.println("Enter Price:");
        p1.setPrice(input.nextDouble());


        displayPizzaDetails(p1);

        Pizza p2 = new Pizza();
        getPizzaDetails(p2);
        displayPizzaDetails(p2);

    }

    public static void displayPizzaDetails(Pizza pizza){
        System.out.println("Toppings : " + pizza.getToppings());
        System.out.println("Diameter : " + pizza.getDiameter());
        System.out.println("Price : " + pizza.getPrice());
    }

    public static void getPizzaDetails(Pizza pizza){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Toppings:");
        pizza.setToppings(input.nextLine());

        System.out.println("Enter Diameter:");
        pizza.setDiameter(input.nextInt());

        System.out.println("Enter Price:");
        pizza.setPrice(input.nextDouble());

    }
}
