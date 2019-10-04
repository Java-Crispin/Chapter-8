package youDoIt;
import java.util.Scanner;
public class distanceFromAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LIMIT = 20;
        double userInput = 0;
        double difference;
        double average;
        double sum = 0;
        double[] userArray = new double[20];
        if (userInput != 999) {
            for (int i = 0; i < LIMIT; i++) {
                System.out.println("Enter quiz score number " + (i + 1) + ">>>> ");
                userInput = input.nextDouble();
                sum = userInput + sum;
                if (userInput < 999) {
                    userArray[i] = userInput;
                }
                if (userInput == 999 && userArray[0] == 0) {
                    userArray = new double[i];
                    i = LIMIT;
                    System.out.println("ERROR no numbers entered.");
                } else if (userInput == 999) {
                    userArray = new double[i];
                    i = LIMIT;
                    average = sum / userArray.length;
                    difference = userArray[i] - average;
                    System.out.println(userArray[i] + " is " + difference + " away from the average.");
                    System.out.println("The average is " + average);
                }
            }
        }
    }
}