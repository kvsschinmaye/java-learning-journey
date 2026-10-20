class Employee {
    String name;
    int employeeId;

    void displayEmployee() {
        System.out.println("\nEmployee Name : " + name);
        System.out.println("Employee ID   : " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    void displayManager(){
        displayEmployee();
        System.out.println("Department    : " + department);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

      Manager mgr = new Manager();
        mgr.name = "Lacy";
        mgr.employeeId = 102;
        mgr.department = "HR";
        mgr.displayManager();

    }
}
