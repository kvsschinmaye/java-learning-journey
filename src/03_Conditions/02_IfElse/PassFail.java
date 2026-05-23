import java.util.Scanner;

public class PassFail{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student : ");
        String name = sc.nextLine();

        System.out.printf("Enter the marks that %s got : ",name);
        int marks = sc.nextInt();

        System.out.printf("Marks scored by %s is %d",name,marks);

        if(marks >= 25)
        {
            System.out.printf("%s has Passed in the Exam",name);
        }

        else{
            System.out.printf("%s has Failed in the Exam",name);
        }

        sc.close();

    }
}