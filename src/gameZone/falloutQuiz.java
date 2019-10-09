package gameZone;
import java.util.Scanner;
import static java.lang.Math.abs;
public class falloutQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = true;
        String converter;
        int count = 0;
        char dataValidation [] = {};
        char correctAnswers [] = {'a','b','c','b','a','b','c','b','a','b'};
        char userEntry;
        int correct = 0;
        int incorrect = 0;
        while (quit) {
            System.out.println("Please choose a, b, or c.\n>>>>>");
            converter = input.next();
            userEntry = converter.charAt(0);
            if (count == 10) {
                quit = false;
            }
            count++;
        }
        for (int i = 0; i < count; i++) {
        }
    }
}
