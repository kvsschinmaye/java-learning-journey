class StudentDetails {
    final int id = 101;

    void display() {
        System.out.println("\nStudent ID : " + id);
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails();
        sd.display();

        // sd.id = 102;
        // Error: cannot reassign a final variable
    }
}