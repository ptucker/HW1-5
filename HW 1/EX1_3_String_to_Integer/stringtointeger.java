import java.util.Scanner;

public class stringtointeger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intInput;
        String stringInput;

        System.out.printf("Enter number: ");
        stringInput = input.nextLine();
        
        if (stringInput.charAt(0) >= '0' && stringInput.charAt(0) <= '9') { // Sees if the first char is between 0 and 9. if not , its not a number.
            System.out.println("You have a integer"); 
            intInput = s2i(stringInput);
            System.out.printf("String answer: %d\n", intInput);

        } else { System.out.println("You did not enter a number");}

        input.close();
        
    }

    public static int s2i(String str) { // function to convert from string to int.
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            //PT -- make sure str.charAt(i) is a digit before add it to the number. -2
            answer = answer * 10 + (str.charAt(i) - '0'); // For loop and goes through each character and mulitplies base and saves to answer.
        }
        return answer;
    }

}
