package com.cpe50.joptionpane;


import javax.swing.*;

/**
 * Description: A program to test JOptionPane
 */
public class DialogTest {
    public static void main(String[] args) {


        String message = "This is a message";
        JOptionPane.showMessageDialog(null, message);

        String userInput = JOptionPane.showInputDialog(null,"Please enter something");
        JOptionPane.showMessageDialog(null, "You entered " + userInput);

        int option = JOptionPane.showConfirmDialog(null, "Would you like to delete this item?");

        if ( option == JOptionPane.YES_OPTION ) {
            JOptionPane.showMessageDialog(null,"Item Deleted");
        } else if ( option == JOptionPane.NO_OPTION ) {
            JOptionPane.showMessageDialog(null,"Item was not deleted");
        } else if ( option == JOptionPane.CANCEL_OPTION ) {
            JOptionPane.showMessageDialog(null,"Deletion Cancelled.");
        }




        int sum = 0;
        do {
            sum += Integer.valueOf(JOptionPane.showInputDialog(null, "Please enter a number"));

        } while ( JOptionPane.showConfirmDialog(null,"Do you like to continue ?") == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}
