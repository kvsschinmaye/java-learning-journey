class Student {

    String name;
    static String college = "GEC College";

    Student(String name) {
        this.name = name;
    }

    void showStudent() {
        System.out.println("Name    : " + name);
        System.out.println("College : " + college);
    }

    static void showCollege() {
        System.out.println("College: " + college);
    }

}

public class StaticVsInstanceDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Sri");
        Student s2 = new Student("Chinmaye");

        s1.showStudent();
        System.out.println();

        s2.showStudent();
        System.out.println();

        Student.showCollege();

    }
}