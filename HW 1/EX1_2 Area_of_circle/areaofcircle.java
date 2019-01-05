import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        final double PI = 3.14; // Constant of PI
        float radius;

        do { // Do while statement if user inputs incorrect number
            System.out.printf("Enter radius: ");
            radius = input.nextInt();
        } while (radius < 0);

        System.out.printf("Area: %f\n", (PI*radius));


    }
}