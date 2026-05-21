public class DataTypesDemo {
    public static void main(String[] args) {
        byte b = 10;
        short s = 789;
        int rollNo = 91;
        long phoneNumber = 9876543210L;

        float averageMarks = 94.7f;
        double cgpa = 9.1;

        char section = 'B';
        boolean isPassed = true;

        String name = "Chinmaye";
        String branch = "CSE" ;

        int[] marks = {98, 91, 95};

        System.out.println("=== Student Details ===");

        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Branch  : " + branch);
        System.out.println("Section : " + section);
        System.out.println("CGPA    : " + cgpa);

        System.out.println();

        System.out.println("=== Other Details ===");

        System.out.println("Average Marks  : " + averageMarks);
        System.out.println("Byte Value     : " + b);
        System.out.println("Short Value    : " + s);
        System.out.println("PhoneNumber    : " + phoneNumber);
        System.out.println("Passed         : " + isPassed);

        System.out.println();

        System.out.println("=== Subject Marks ===");

        System.out.println("Subject 1 Marks : " + marks[0]);
        System.out.println("Subject 2 Marks : " + marks[1]);
        System.out.println("Subject 3 Marks : " + marks[2]);
    }
}
