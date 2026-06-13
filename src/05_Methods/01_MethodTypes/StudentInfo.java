import java.util.Scanner;

class StudentInfo {

    public static String getName(Scanner sc)
    {
        System.out.print("\nEnter the Name        : ");
        return sc.nextLine();
    }

    public static int getAge(Scanner sc)
    {
        System.out.print("Enter the age         : ");
        return sc.nextInt();
    }

    public static String getCourse(Scanner sc)
    {
        sc.nextLine();
        System.out.print("Enter the course name : ");
        return sc.nextLine();
    }

    public static double getAverage(Scanner sc)
    {
        System.out.print("\nEnter the marks of subject 1 : ");
        int marks1 = sc.nextInt();

        System.out.print("Enter the marks of subject 2 : ");
        int marks2 = sc.nextInt();

        System.out.print("Enter the marks of subject 3 : ");
        int marks3 = sc.nextInt();

        double average = (marks1 + marks2 + marks3)/3.0;
        return average;
    }

    public static String getGrade(double average)
    {
        if(average >= 90)  return "A";
        else if(average >= 75) return "B";
        else if(average >= 60) return "C";
        else if(average >= 55) return "D";
        else return "F";
    }

    public static void display(String name,int age,String course,double average,String grade)
    {
        System.out.println("\n=== student Details ===\n");
        System.out.println("Name          : " +name);
        System.out.println("Age           : "+age);
        System.out.println("Course        : "+course);
        System.out.printf("Average marks : %.2f\n",average);
        System.out.println("Grade         : "+grade);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = getName(sc);
        int age = getAge(sc);
        String course = getCourse(sc);
        double average = getAverage(sc);
        String grade = getGrade(average);
        display(name, age,  course, average, grade);

        sc.close();
    }
}