class EmployeeDemo {
    String name;
    double salary;
    static String company = "ABC";

    EmployeeDemo(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("\n=== Employee Details ===");
        System.out.println("Name    : " + name);
        System.out.println("Salary  : " + salary);
        System.out.println("Company : " + company);
    }

    static void displayCompany(){
        System.out.println("\n=== Static Method ===");
        System.out.println("Company : " + company);
    }
}

public class StaticInstanceDemo {
    public static void main(String[] args) {
        EmployeeDemo ed = new EmployeeDemo("Arnab", 356189);
        EmployeeDemo ed1 = new EmployeeDemo("Akra", 218642);

        EmployeeDemo.displayCompany();

        ed.displayDetails();
        ed1.displayDetails();

    }
}