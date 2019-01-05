import java.util.Scanner;

public class countingNumbers { // class name
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);  // Scans the inputs
        int number;

        do { // Do while statement if user inputs incorrect number
            System.out.printf("Enter number between 10 - 100: ");
            number = cin.nextInt();
        } while (number <= 10 || number >= 100);

        for (int i = 1; i <= number; i++) {// for loops and prints the numbers
            System.out.printf("%d", i);
            
            if(i % 2 == 0) { // if the remainder is 0, then its even otherwise, odd
                System.out.println(": Even");
            } else {
                System.out.println(": Odd");
            }
        }
    }
}