import java.util.Scanner;

public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    // n = number of disks
    // source = the rod from which disks are moved
    // auxiliary = the helper rod
    // destination = the rod to which disks are moved
    public static void solve(int n , char source , char auxiliary , char destination){
        // Base case: if only one disk, move it directly
        if(n == 1) {
            System.out.println(" Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move top n-1 disks from source to auxiliary (using destination as helper)
        solve(n - 1 , source , destination , auxiliary); // source to auxiliary

        // Step 2: Move the largest disk (nth) from source to destination
        System.out.println(" Move disk " + n + " from " + source + " to " + destination); // move largest(nth) disk from source to destination

        // Step 3: Move the n-1 disks from auxiliary to destination (using source as helper)
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