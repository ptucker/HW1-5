import java.util.Scanner;

public class employeesTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        employees E1 = new employees(); // Uses default constructor
        employees E2 = new employees(2192794,"Casey Sweet","September","Student","Alexa"); // Made a object
        employees E3 = new employees(); // This object will be used by the user
        
        System.out.printf("\nCurrent Employers: ");

        //System.out.println(E1.getName());  prints out the summary of each employee
        E1.ESummary();
        E2.ESummary();

        // Prompts the user to add a employee to the list of employees.
        System.out.printf("Make an employee");
            
        System.out.println("\nName:");
        String name = input.nextLine();
        E3.setName(name);
        
        System.out.println("\nID: ");
        int id = Integer.parseInt(input.nextLine()); // I did this so it doesnt skip this line
        E3.setID(id);
        
        System.out.println("\nHire Date: ");
        String hireDate = input.nextLine();
        E3.setHireDate(hireDate);

        System.out.println("\nPosition: ");
        String position = input.nextLine();
        E3.setPosition(position);

        System.out.println("\nBoss Name: ");
        String bossName = input.nextLine();
        E3.setBossName(bossName);
        
        // outputs all employees.
        System.out.println("Current Employers: ");
        E1.ESummary();
        E2.ESummary();
        E3.ESummary();

        input.close();
    }
}