import java.util.Scanner;

public class CGPACalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Marks Calculator ===");

        System.out.print("\nEnter the name of the student : ");
        String name = sc.nextLine();

        System.out.print("Enter the Branch :  ");
        String branch = sc.next();

        System.out.println("Enter the grade points and credit points of course 1:");
        int grade1 = sc.nextInt();
        int credit1 = sc.nextInt();

        System.out.println("Enter the grade points and credit points of course 2:");
        int grade2 = sc.nextInt();
        int credit2 = sc.nextInt();

        System.out.println("Enter the grade points and credit points of course 3:");
        int grade3 = sc.nextInt();
        int credit3 = sc.nextInt();

        double totalGradePoints = (grade1 * credit1) + (grade2 * credit2) + (grade3 * credit3);
        int totalCredits = credit1 + credit2 + credit3;
        double sgpa = totalGradePoints / totalCredits;

        System.out.println("=== Student Details ===");

        System.out.println("Name of the Student : " +name);
        System.out.println("Branch : " +branch);

        System.out.println();

        System.out.println("Total Grade Points : "+totalGradePoints);
        System.out.println("Total Credits       : "+totalCredits);
        System.out.printf("SGPA               : %.2f\n",sgpa);

         double cgpa = sgpa; //Assuming sgpa as cgpa for single semester

        System.out.printf("CGPA               : %.2f",cgpa);

        sc.close();

    }
}