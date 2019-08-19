package employeeApp;

public class Company
{
    private static int maxId = 0;

    // BECAUSE THESE ARE PUBLIC, NO NEED FOR GETTERS AND SETTERS, BUT WE LOST CONTROL
    // IE CANNOT VALIDATE DATA OR CHANGE IT, THIS IS DISCOURAGED
    public int id;
    public String name;
    public int debt;
    
    public Company(String name, int debt)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.debt = debt;
    }
}