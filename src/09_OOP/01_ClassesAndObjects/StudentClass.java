public class StudentClass{

    String name;
    int rollNo;
    int age;
    float m1,m2,m3;

    void displayDetails(){
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Age     : " + age);
        System.out.printf("Marks   : m1 = %.2f, m2 = %.2f, m3 = %.2f%n", m1, m2, m3 );
        System.out.println("Average : " + getAverage());
        System.out.println("Grade   : " + getGrade());
    }

    float getAverage(){
        return (m1+m2+m3)/3;
    }

    String getGrade(){
        float avg = getAverage();
        if(avg >= 90) return "S";
        else if(avg >= 80) return "A";
        else if(avg >= 70) return "B";
        else if(avg >= 60) return "C";
        else return "D";
    }

    public static void main(String[] args) {

        StudentClass st1 = new StudentClass();
        st1.name = "Chinmaye";
        st1.rollNo = 10;
        st1.age = 20;
        st1.m1 =  67f; st1.m2 = 73f; st1.m3 = 85f;

        StudentClass st2 = new StudentClass();
        st2.name = "Sri";
        st2.rollNo = 1;
        st2.age = 23;
        st2.m1 =  79f; st2.m2 = 48f; st2.m3 = 59f;

        System.out.println("\n=== Details Of Student 1 ===");
        st1.displayDetails();

        System.out.println("\n=== Details Of Student 2 ===");
        st2.displayDetails();

    }
}