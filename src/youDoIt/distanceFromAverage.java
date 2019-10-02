package youDoIt;
import java.util.Scanner;
public class distanceFromAverage {
    public static void main(String[]args){
        boolean quit = false;
        double userInput;
        double average;
        double sum = 0;
        int [] userArray = new int [20];
        do{
            for(int i = 0; i < userArray.length; i ++){
                System.out.println("Enter quiz score number " + (i + 1) +">>>> ");
                userInput = input.nextInt();
                sum = sum + userInput;
                average = sum/userArray.length;
                System.out.println(userArray[i] + " is " + average + " away from the average.");
            }

        }while(quit == false);
    }
}