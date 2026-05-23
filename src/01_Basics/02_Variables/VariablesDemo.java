public class VariablesDemo {

    // Static Variable
    static String collegeName = "GEC";

    // Instance Variables
    String name = "Chinmaye";
    int rollNo = 91;

    public static void main(String[] args) {

        // Local Variable
        int age = 20;

        // Creating Object
        VariablesDemo student = new VariablesDemo();

        System.out.println("==== Student Details ====");

        // Accessing Instance Variables
        System.out.println("Name         : " + student.name);
        System.out.println("Roll Number  : " + student.rollNo);

        // Accessing Local Variable
        System.out.println("Age          : " + age);

        // Accessing Static Variable
        System.out.println("College Name : " + collegeName);
    }
}