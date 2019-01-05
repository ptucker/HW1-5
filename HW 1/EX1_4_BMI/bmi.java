import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height; //meters
        double weight; // kilograms
        
        do {
        System.out.printf("Enter your height in inches: ");  // Checks your height
        height = input.nextInt();
        System.out.printf("Enter your weight in lbs: "); // Checks your weight
        weight = input.nextInt();
        } while (height < 0 || weight < 0);
        
        weight = weight*0.453592;  // Does the math to find height and weight
        height = height*0.0254;
        
        double bmi = height/(weight * weight); // Calculates the bmi
        
        System.out.printf("Your BMI: %f kg/m^2\n", bmi);
    }
}