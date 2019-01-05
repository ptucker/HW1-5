import java.util.*;
import java.sql.Date;
import java.time.*;


public class dateTest {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int inputYear;
        int inputMonth;
        int inputDay;
        boolean leapYear = false;
        int lDay = 31;

        // Find the specific day to display
        final int year = Calendar.getInstance().get(Calendar.YEAR);
        final int month = (Calendar.getInstance().get(Calendar.MONTH)+1);
        final int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        date d1 = new date(12, 13, 1997);
        date d2 = new date(month, day, year);
        date d3 = new date();
        date d4 = new date();


        System.out.printf("Todays Date: ");
        d2.DSummary();

        //while ()
        ///// Year input //////
        System.out.println("Enter a before Date ");
        System.out.printf("Year: ");
        inputYear = Integer.parseInt(read.nextLine());
        
        if  ((inputYear % 4 == 0) && (inputYear % 100 != 0) || (inputYear % 400 == 0)) { /// To check if it leap year or not.
            System.out.println("Its leap year");
            leapYear = true; } else {
            System.out.println("Its not leap year");
            leapYear = false;
        }
        d3.setYear(inputYear);

        ////// Month Input /////
        do {
            System.out.printf("Month: ");
            inputMonth = Integer.parseInt(read.nextLine());
        } while (inputMonth <= 0 || inputMonth > 12);
        d3.setMonth(inputMonth);

        ///// Day Input //////
        do {
            System.out.printf("Day: ");
            inputDay = Integer.parseInt(read.nextLine());
            if (inputMonth == 2 && leapYear == true) { lDay = 29;}
            else if (inputMonth ==2 && leapYear != true) {lDay = 28;}
            else if (inputMonth % 2 == 0) {lDay = 30; } else {lDay = 31;}
        } while (inputDay <= 0 || inputDay > lDay);  
        d3.setDay(inputDay);

        System.out.printf("\nBefore Date: ");
        d3.DSummary();
        
        ///////////////////////
        // I know this is not the efficient way of programming because I just copied the code above to prompt the user to enter
        // the after date. I was originally going to place all these functions
        // like leap year, or the day if-statemetns in the corresponding functions in my other class. Time was against me.
        ///////////////////////
        
        System.out.println("Enter a after Date ");
        System.out.printf("Year: ");
        inputYear = Integer.parseInt(read.nextLine());
        
        if  ((inputYear % 4 == 0) && (inputYear % 100 != 0) || (inputYear % 400 == 0)) { /// To check if it leap year or not.
            System.out.println("Its leap year");
            leapYear = true; } else {
            System.out.println("Its not leap year");
            leapYear = false;
        }
        d4.setYear(inputYear);

        ////// Month Input /////
        do {
            System.out.printf("Month: ");
            inputMonth = Integer.parseInt(read.nextLine());
        } while (inputMonth <= 0 || inputMonth > 12);
        d4.setMonth(inputMonth);

        ///// Day Input //////
        do {
            System.out.printf("Day: ");
            inputDay = Integer.parseInt(read.nextLine());
            if (inputMonth == 2 && leapYear == true) { lDay = 29;}
            else if (inputMonth ==2 && leapYear != true) {lDay = 28;}
            else if (inputMonth % 2 == 0) {lDay = 30; } else {lDay = 31;}
        } while (inputDay <= 0 || inputDay > lDay);  
        d4.setDay(inputDay);

        System.out.printf("\nAfter Date: ");
        d4.DSummary();

        // int beforeYear = d3.getYear();
        // int beforeMonth = d3.getMonth();
        // int beforeDay = d3.getDay();
        // int afterYear = d4.getYear();
        // int afterMonth = d4.getMonth();
        // int aftereDay = d4.getDay();
        
        // LocalDate beforeDate = LocalDate.of(beforeYear,beforeMonth,beforeDay);
        // LocalDate afterDate = LocalDate.of(afterYear,afterMonth,afterDay);

        //System.out.println("Difference in days: " + afterDate.until(beforeDate));
        
        read.close();
    }

}

