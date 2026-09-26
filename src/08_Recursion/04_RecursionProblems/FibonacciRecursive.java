import java.util.Scanner;

public class FibonacciRecursive {

    public static int fib(int num){
        if(num == 0)
            return 0;
        if(num == 1)
            return 1;
        return fib(num -1)+fib(num - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.printf("Fibonacci of %d is : \n",num);

        for(int i = 0 ; i < num ; i++)
            System.out.print(fib(i) + " ");

        sc.close();

    }
}