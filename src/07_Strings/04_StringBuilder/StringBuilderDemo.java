public class StringBuilderDemo {

    public static void main(String[] args) {

        System.out.println("=== String Builder Methods Demo ===");

        StringBuilder sb = new StringBuilder( " Java ");
        System.out.println("Initial String : " + sb);

        System.out.println("After append  : " +sb.append(" Programming "));
        System.out.println("After insert : " +sb.insert(sb.length()," Language "));
        System.out.println("After replace : " +sb.replace(0,4,"Python"));
        System.out.println("After remove : " +sb.delete(0,7));

        if(sb.length() > 3){
            sb.setCharAt(3,'X');
            System.out.println("After Change : " +sb);
        }
        else {
            System.out.println("Skipping setCharAt (index out of range)");
        }

        if (sb.length() > 7) {
            sb.deleteCharAt(7);
            System.out.println("After removing a character : " + sb);
        }

        System.out.println("After reverse : " +sb.reverse());
        System.out.println("Length   : " + sb.length());
        System.out.println("Capacity : " + sb.capacity());

    }
}