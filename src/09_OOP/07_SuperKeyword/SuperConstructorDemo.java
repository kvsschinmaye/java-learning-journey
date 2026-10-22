class Employee1 {
    String name;

    Employee1(String name){
        this.name = name;
    }
}

class Developer extends Employee1 {
    int experience;

    Developer(String name, int experience){
        super(name);
        this.experience = experience;
    }

    void displayDetails(){
        System.out.println("\nName of the Employee : " + name);
        System.out.println("Work Experience      : " + experience + " years");
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {
        Developer d = new Developer("Ravi",3);
           d.displayDetails();
    }
}