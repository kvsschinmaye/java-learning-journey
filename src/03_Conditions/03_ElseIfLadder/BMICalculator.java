import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the person: ");
        String name = sc.nextLine().toUpperCase();

        System.out.printf("Enter the weight(kg) of %s : ",name);
        float weight = sc.nextFloat();

        System.out.printf("Enter the height(in cm) of %s : ",name);
        float heightCm = sc.nextFloat();
        float heightM = heightCm / 100;

        float bmi =  weight / (float)Math.pow(heightM,2) ;

        System.out.println("\nBody Mass Index (BMI) : "+bmi);

        if(bmi < 18.5)
        {
            System.out.printf("%s is in Underweight",name);
        }

        else if(bmi >= 18.5 && bmi < 25)
        {
            System.out.printf("%s is in Normalweight",name);
        }

        else if (bmi >= 25 && bmi < 30)
        {
            System.out.printf("%s is in Overweight",name);
        }

        else if(bmi >=30)
        {
            System.out.println("%s is obese");
        }

        sc.close();

    }
}