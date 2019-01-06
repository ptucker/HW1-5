
public class employees {
    
    //my private functions
    private int ID;
    private String name;
    private String hireDate;
    private String position;
    private String bossName;

    // Default Constructor...
    public employees() {
        ID = 123456789;
        name = "Mason Caird";
        hireDate = "September";
        position = "Student";
        bossName = "Alexa";
    }
    
    // Constructor...
    public employees(int ID, String name, String hireDate, String position, String bossName) {
        this.ID = ID;
        this.name = name;
        this.hireDate = hireDate;
        this.position = position;
        this.bossName = bossName;
    }

    // get function...
    public int getID() {return ID;}
    public String getName() {return name;}
    public String getHireDate() {return hireDate;}
    public String getPosition() {return position;}
    public String getBossName() {return bossName;}

    // set function...
    public void setID(int id) {ID = id;}
    public void setName(String Name) {name = Name;}
    public void setHireDate(String HireDate) {hireDate = HireDate;}
    public void setPosition(String Position) {position = Position;}
    public void setBossName(String BossName) {bossName = BossName;}

    //PT -- this would be better as a override of toString()
    // Makes a summary for the employee of whom ill be displaying
    public void ESummary() {
        System.out.printf("\n\nName: " + name + "\nID: " + ID + "\nHire Date: " + hireDate + "\nPosition: " + 
        position + "\nBoss Name: " + bossName + "\n");
    }

}
