
// case sensitive
package employeeApp;

// CAPITALIZE YOUR CLASSES (NAME)
// classes come with braces (curlies) up to u where u put them
// class contains two things, 1. fields - which is state, 2. 
public class Employee
{
    // int is a BASE datatype (base datatypes are lowercase)
    // String is NOT a base datatype (it is actually a CLASS) Class by convention start with a capital letter
    private static int maxId = 0; // a SHARED value for all Tests objects

    private int id;
    private String firstName;
    private String lastName;
    // JAVA way to handle real NUMBERS (datatypes) with decimals is with double, but can also use float
    private double salary;
    private boolean has401k;
    private int companyId;
    private int healthPlanId;

    // constructor - is a method but a SPECIAL one, initial STATE

    // can have multiple constructors BUT the parameters have to be UNIQUE to each one
    // HOW YOU KNOW IT IS AN CONSTRUCTOR - you dont give datatype, HAS to have SAME NAME as public class file name
    public Employee(String firstName, String lastName, double salary, boolean has401k, int companyId, int healthPlanId)
    {
        maxId++;

        id = maxId;

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.has401k = has401k;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }

    // Other thing a class has is methods (behavior is a type of method) what can the class DO?
    // methods - Behavior

    // methods - getters and setters <-- allow us to get OR set these fields (state)
    // THE REASON WE DONT ACCESS THE STATE DIRECTLY, IS BECAUSE WHEN WE RETURN WE MIGHT WANT TO DO THINGS
    // TO STATE BEFORE WE RETURN, IE IF STRING WE MIGHT WANT TO CAPITALIZE IT
    // WHOLE POINT OF GETTERS AND SETTERS IS ALL ABOUT US BEING ABLE TO CONTROL IT MORE
    public int getId() // create a getter to grab the id from this class
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    // method - sets the first name (we give it one)
    // the first name we give it is going to be assigned to state
    // when the method ends, anything that happens goes away
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // IF we RETURN something, BEFORE, you can use any variable you have to tell Java what that 
    // variable type is going to be
    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public boolean get401k()
    {
        return has401k;
    }

    public void set401k(boolean has401k)
    {
        this.has401k = has401k;
    }

    public int getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(int companyId)
    {
        this.companyId = companyId;
    }

    public int getHealthPlanId()
    {
        return healthPlanId;
    }

    public void setHealthPlanId(int healthPlanId)
    {
        this.healthPlanId = healthPlanId;
    }

    // regular methods
    public String getName()
    {
        return firstName + " " + lastName;
    }

    public void giveRaise(double raise)
    {
        // private variable (only used in giveRaise)
        double raiseAmount;
        raiseAmount = salary * raise;
        salary = salary + raiseAmount;
    }

    // overrides the built in methods for any object method, you want to target
    @Override
    public String toString()
    {
        String returnString =   "id: " + id + "\n" +
                                "firstName: " + firstName + "\n" +
                                "lastName: " + lastName + "\n" +
                                "salary: " + salary + "\n" +
                                "has401k: " + has401k + "\n" +
                                "companyId: " + companyId + "\n" +
                                "healthPlanId: " + healthPlanId + "\n";

        return returnString;
        
    }
}
