package youDoIt;
import java.util.Scanner;
import static java.lang.Math.abs;
public class distanceFromAverage {
    public static void main(String[] args) {
        double[]arryNums = new double[20];
        boolean quit = true;
        int count = 0;
        double userEntry;
        double total = 0;
        double average = 0;
        double distance = 0;
        Scanner input = new Scanner(System.in);
        while(quit){
            System.out.println("Please enter a number.\n>>>>>");
            userEntry=input.nextDouble();
            if(count == 20){
                quit = false;
            }
            else if(userEntry == 99999 && count < 1){
                System.out.println("ERROR.");
            }
            else if(userEntry == 99999){
                quit = false;
            }
            else {
                arryNums[count]=userEntry;
                total = total + userEntry;
                count++;
            }
        }
        average = total / count;
        for(int i = 0;i < count; i++){
            distance = arryNums[i] - average;
            System.out.println("The average is " + average + " \nThe entry was " + arryNums[i] +
            "\nThe distance is " + abs(distance));
        }
    }
}