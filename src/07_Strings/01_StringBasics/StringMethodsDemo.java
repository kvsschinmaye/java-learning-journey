public class StringMethodsDemo {

    public static void main(String[] args) {

        String str = "Java is a programming language";

        System.out.println("Length of String : " + str.length());
        System.out.println("Upper Case : " + str.toUpperCase());
        System.out.println("Lower Case : " + str.toLowerCase());
        System.out.println("Trimmed String : " + str.trim());

        if(!str.isEmpty()) {
            System.out.println("First Character : " + str.charAt(0));
            System.out.println("Last Character : " + str.charAt(str.length() - 1));
        }

        System.out.println("Sub String : " + str.substring(0,4));
        System.out.println("Contains 'Java' : " +str.contains("Java"));
        System.out.println("IndexOf 'Java' : " + str.indexOf("Java"));
        System.out.println("Starts with 'Java' : " + str.startsWith("Java"));
        System.out.println("Ends with 'Java' : " +str.endsWith("Java"));
        System.out.println("Replace 'Java' : " +str.replace("Java" , "Python"));

    }
}

