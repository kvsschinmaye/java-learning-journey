public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(" Hello ");

        System.out.println("After append : " +sb.append(" Sri "));
        System.out.println("After insert : " +sb.insert(0, " Hi "));
        System.out.println("Length : " +sb.length() );
        System.out.println("Capacity : " +sb.capacity());
        System.out.println("After replace : " +sb.replace(3,5," Sai "));

        if(sb.length() > 5){
            sb.setCharAt(5,'X');
        }
        System.out.println("After setChar : " +sb);

        if(sb.length() > 5) {
            System.out.println("After deleting a particular character : " + sb.deleteCharAt(5));
        }
        System.out.println("After delete : " +sb.delete(0,3));
        System.out.println("After reverse : " +sb.reverse());

        String result = sb.toString();
        System.out.println("As String : " + result);
    }
}