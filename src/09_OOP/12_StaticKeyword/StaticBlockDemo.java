class Configuration {
    static String message ;

    static {
        message = "Configuration loaded";
        System.out.println("\nStatic block executed");
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println(Configuration.message);
    }
}