package employeeApp;

public class Main
{
    // class method, HAS TO HAVE THE WORD STATIC, meaning it is related to THIS class
    public static void workWithData()
    {
        // instance of the class ( make an object of the class ) called Instantiate
        // Healthplan is a datatype ie CLASS
        Healthplan h1 = new Healthplan("Region's Hospital");
        Healthplan h2 = new Healthplan("Saint John");

        Company c1 = new Company("Aimia" 4000);
        
        Employee e1 = new Employee("Koua", "Xiong", 60000, true, c1.id, h1.getId());
        Employee e2 = new Employee("Toua", "Xiong", 80000, true, c1.id, h2.getId());

        System.out.println("*** Query Data ***");
        // EVERY OBJECT HAS A BUILT IN METHOD CALLED TOSTRING
        System.out.println(e1);
        System.out.println(c1);

        System.out.println("*** Data Types - Numbers ***");
        System.out.println("Original divided 5 " + (c1.debt / 5));
        System.out.println("Original mod 2 " + (c1.debt % 2));
        System.out.println("Original divided 7 " + (c1.debt / 7));
        System.out.println("Original divided 7.0 " + (c1.debt/ 7.0));
        System.out.println("Orginal divided 7 but giving type double to debt " + ((double)c1.debt / 7));
        System.out.println();

        String myStr = "4000";
        System.out.println("Debt: " + myStr + c1.debt);
        int tempInt = Integer.parseInt(myStr) + c1.debt;
        double tempDouble = e1.getSalary() + 1000;

        // e1.setSalary(tempDouble);
        e1.setSalary(e1.getSalary()+1000);

        System.out.println("Debt: " + tempInt);
        System.out.println("Salary: " + e1.getSalary());
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}