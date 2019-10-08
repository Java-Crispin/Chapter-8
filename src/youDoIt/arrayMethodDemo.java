package youDoIt;
public class arrayMethodDemo {
    public static void main(String[]args){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        displayAll(array);
        displayReverse(array);
        displayTotal(array);
        display(array);
        displayAboveAvg(array);
    }
    public static void displayAll(int[] array){
        System.out.println("The numbers in order are.");
        for (int i = 0; i <= 9; i++) {
            System.out.println(array[i]);
        }
    }
    public static void displayReverse(int[] array){
        System.out.println("The numbers in reverse order are.");
        for (int i = 9; i >= 0; --i) {
            System.out.println(array[i]);
        }
    }
    public static void displayTotal(int[] array){
        int total = 0;
        for (int i = 0; i <= 9; i++) {
            total = total + array[i];
        }
        System.out.println("The total is " + total + ".");
    }
    public static void display(int[] array){
        System.out.println("The values less than six are.");
        for (int i = 0; i <= 4; i++) {
            System.out.println(array[i]);
        }
    }
    public static void displayAboveAvg(int[] array){
        System.out.println("The numbers below average are.");
        int average ;
        int total = 0;
        for (int i = 0; i <= 9; i++) {
            total = total + array[i];
            average = total / array.length;
        }
        average = total / array.length;
        for(int i = 0; i < (average-1); i++){
            System.out.println(array[i]);
        }
        System.out.println("The average is " + average + ".");
    }
}