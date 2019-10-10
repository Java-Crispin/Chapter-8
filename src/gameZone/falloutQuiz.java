package gameZone;
import java.util.Scanner;
import static java.lang.Math.abs;
public class falloutQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = true;
        String converter;
        int count = 0;
        String questions [] = {
                "When was the first Fallout game released?",
                "Which virus caused humans to mutate into super mutants?",
                "Where is Fallout 3 set in?",
                ""
        };
        char dataValidation [] = {'a', 'A', 'b', 'B', 'c', 'C'};
        char correctAnswers [] = {'a','b','c','b','a','b','c','b','a','b'};
        char userEntry;
        int correct = 0;
        int incorrect = 0;
        while (quit) {
            for (int i = 0; i < count; i++) {
                System.out.println(questions[i]);
            System.out.println("Please choose a, b, or c.\n>>>>>");
            converter = input.next();
            userEntry = converter.charAt(0);
            if (count == 10) {
                quit = false;
            }
            count++;
            }
        }
    }
}
