package gameZone;
import javax.swing.*;
import java.util.Scanner;
public class quiz {
        public static void main(String[]args){
            final int NUMBER_OF_QUESTIONS = 10;
            String [] questions = {};
            char [] answers = {'a','b','c','b','a','b','c','b','a','b'};
            String strItem;
            String userInput;
            boolean Continue = true;
            int itemOrdered;
            double itemPrice = 0.0;
            boolean validItem = false;
            boolean again = true;
            while(again) {
                strItem = JOptionPane.showInputDialog(null, "Enter the item number you would like to order");
                itemOrdered = Integer.parseInt(strItem);
                for (int i = 0; i < NUMBER_OF_QUESTIONS; ++i) {
                    if (itemOrdered == questions[i]) {
                        validItem = true;
                        itemPrice = prices[i];
                    }
                }
                if (validItem) {
                    JOptionPane.showMessageDialog(null, "Thr price for item number " +
                            itemOrdered + " is $" + itemPrice);
                } else
                    JOptionPane.showMessageDialog(null, "Sorry, entry is invalid.");
                strItem = JOptionPane.showInputDialog(null, "Order again? yes or no");
                if (strItem.equalsIgnoreCase("no")) {
                    again = false;
                }
            }
        }
    }