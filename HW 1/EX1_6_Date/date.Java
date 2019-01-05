

public class date {
    
    // Private variables
    private Integer day;
    private Integer month;
    private Integer year;

    // Default Constructor
    date() {
        day = 1;
        month = 1;
        year = 2000;
    }

    // Constructor
    date(int m, int d, int y) {
        day = d;
        month = m;
        year = y;
    }
    
    // getFunctions...
    public Integer getDay(int day) {return day;}
    public Integer getMonth(Integer Month) {return month;}
    public Integer getYear(int Year) {return year;}

    // setFunctions...
    public void setDay(int Day) {
        
        day = Day;}
    public void setMonth(int Month) {
        
        month = Month;}
    public void setYear(int Year) {
        
        year = Year;}

    // Summary function to represent a day.
    public void DSummary() {
        System.out.printf("\n" + month + "/" + day + "/" + year + "\n\n");
    }
}