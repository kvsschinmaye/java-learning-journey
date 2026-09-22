import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(", ");
        sj.add("Apple");
        sj.add("Banana");
        sj.add("Orange");
        System.out.println("\nFruits: " + sj);

        StringJoiner sj1 = new StringJoiner(", " , "[", "]");
        sj1.add("Java");
        sj1.add("Python");
        sj1.add("C++");
        System.out.println("Languages: " + sj1);

        StringJoiner sj2 = new StringJoiner(", ");
        sj2.add("Dog").add("Cat");
        System.out.println("Animals: " + sj2);

        sj.merge(sj2);
        System.out.println("Merged: " + sj);

    }
}