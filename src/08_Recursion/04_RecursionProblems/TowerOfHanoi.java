import java.util.Scanner;

public class TowerOfHanoi {

    public static void solve(int n , char source , char auxiliary , char destination){
        if(n == 1) {
            System.out.println(" Move disk 1 from " + source + " to " + destination);
            return;
        }
        solve(n - 1 , source , destination , auxiliary); // source to auxiliary

        System.out.println(" Move disk " + n + " from " + source + " to " + destination); // move largest(nth) disk from source to destination

        solve(n -1,auxiliary,source,destination); // auxiliary to destination
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter number of disks : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of disks must be positive.");
            sc.close();
            return;
        }
        
        System.out.println(" The Moves are : ");
        solve(n,'A','B','C');

        sc.close();
    }
}