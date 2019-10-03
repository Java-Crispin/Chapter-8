package youDoIt;
import java.util.Scanner;
public class distanceFromAverage {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        double userInput;
        double differnce;
        double average;
        double sum =0;
        double [] userArray = new double [20];
            for(int i = 0; i < userArray.length; i ++) {
                System.out.println("Enter quiz score number " + (i + 1) + ">>>> ");
                userInput = input.nextDouble();
                if (userInput == 999) {
                    quit = true;
                }
                sum = userInput + sum;
                average = sum / userArray.length;
                userArray[i] = userInput;
                    }
        if(quit == true){
            for(int j = 0; j < userArray.length; j ++) {
                average = sum / userArray.length;
                differnce = userArray[j]-average;
                System.out.println(userArray[j] + " is " + differnce + " away from the average.");
                }
            }
    }
}