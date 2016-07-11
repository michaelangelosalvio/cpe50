package com.cpe50.products;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by msalvio on 11/07/16.
 */

public class TestItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;

        Product[] products = new Product[5];
        products[0] = new Product("1111", "Product A", 5);
        products[1] = new Product("2222", "Product B", 6);
        products[2] = new Product("3333", "Product C", 7);
        products[3] = new Product("4444", "Product D", 8);
        products[4] = new Product("5555", "Product E", 9);

        ArrayList<Item> items = new ArrayList<Item>();


        do {
            System.out.print("Enter Barcode :");
            String barcode = input.nextLine();

            Product product = isItemFound(products, barcode);

            if ( product != null ) {
                System.out.print("Enter Quantity : ");
                int quantity = input.nextInt();
                input.nextLine();
                items.add(new Item(product,quantity));
            } else {
                System.out.println("Barcode not found");
            }

            System.out.print("Do you like to continue ? (Y/N) : ");
            option = input.nextLine();

        } while( option.toLowerCase().equals("y") );

        display(items);

    }

    public static Product isItemFound(Product[] products, String barcode){
        for ( Product product : products ) {
            if ( product.getBarcode().equals(barcode) ) {
                return product;
            }
        }

        return null;
    }

    public static void display(ArrayList<Item> items){
        System.out.println("Product\t\tQty\tPrice\tAmount");
        double totalAmount = 0;
        for ( Item item : items ) {
            totalAmount += item.getAmount();
            System.out.println(item);
        }

        System.out.println("\t\tTotal Amount : \t" + totalAmount);

    }
}
