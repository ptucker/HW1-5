import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height; //meters
        double weight; // kilograms
        
        do {
            //PT -- take care with your indenting.
        System.out.printf("Enter your height in inches: ");  // Checks your height
            //PT -- why nextInt when you're reading into a double? -1
        height = input.nextInt();
        System.out.printf("Enter your weight in lbs: "); // Checks your weight
        weight = input.nextInt();
        } while (height < 0 || weight < 0);
        
        //PT -- what are these numbers? 
        //PT -- better for readability to name these: private static final POUND_TO_KG = 0.453592;
        weight = weight*0.453592;  // Does the math to find height and weight
        height = height*0.0254;
        
        double bmi = height/(weight * weight); // Calculates the bmi
        
        System.out.printf("Your BMI: %f kg/m^2\n", bmi);
    }
}
