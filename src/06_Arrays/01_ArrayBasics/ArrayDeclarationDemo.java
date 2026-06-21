public class ArrayDeclarationDemo {
    public static void main(String[] args) {

        int[] marks = {86, 87, 88, 89, 91, 90, 92, 93};

        System.out.println("=== Array Declaration and Traversal Demo ===");

        System.out.println("\nUsing for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[ " + i + " ] = " + marks[i]);
        }

        System.out.println("\nUsing Enhanced for loop");
        for(int mark : marks)
        {
            System.out.print(mark + " ");
        }

        System.out.println("\n\nFirst element       : " + marks[0]);
        System.out.println("Last element        : " + marks[marks.length - 1]);
        System.out.println("Length of the array : " + marks.length);

    }
}