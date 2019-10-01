package youDoIt;
import java.util.Scanner;
public class arrayMethodDemo {
    public static void main(String[]args){
        int score;
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i< array.length; i++){
            System.out.println("Enter quiz score number " + i + ">>>> ");
            score = input.nextInt();
            array[i] = score;
        }
        all.displayAll(array);
    }
}