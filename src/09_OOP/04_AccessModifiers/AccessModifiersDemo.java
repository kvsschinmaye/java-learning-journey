
public class AccessModifiersDemo {

    public int publicField = 10;
    protected int protectedField = 20;
    int defaultField = 30;
    private int privateField = 40;

    public void showPublicField() {
        System.out.println("Public Field    : " + publicField);
    }

    public void showPrivateField() {
        System.out.println("Private Field   : " + privateField);
    }

    public void showProtectedField() {
        System.out.println("Protected Field : " + protectedField);
    }

    public void showDefaultField() {
        System.out.println("Default Field   : " + defaultField);
    }

    public void demonstrateAccessInsideClass() {
        System.out.println("\n=== Access Inside AccessModifiersDemo ===");

        System.out.println("Public Field    : " + publicField);
        System.out.println("Protected Field : " + protectedField);
        System.out.println("Default Field   : " + defaultField);
        System.out.println("Private Field   : " + privateField);

        System.out.println("\nCalling methods inside the same class:");
        showPublicField();
        showProtectedField();
        showDefaultField();
        showPrivateField();
    }

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();

        demo.demonstrateAccessInsideClass();

        System.out.println("\n=== Access From main() ===");
        System.out.println("Public Field    : " + demo.publicField);
        System.out.println("Protected Field : " + demo.protectedField);
        System.out.println("Default Field   : " + demo.defaultField);

        demo.showPublicField();
        demo.showProtectedField();
        demo.showDefaultField();
        demo.showPrivateField();

        TestAccess test = new TestAccess();
        test.demonstrateAccessOtherClass();
    }
}

class TestAccess {

    public void demonstrateAccessOtherClass() {
        AccessModifiersDemo demo = new AccessModifiersDemo();

        System.out.println("\n=== Access From Another Class (Same Package) ===");

        System.out.println("Public Field    : " + demo.publicField);
        System.out.println("Protected Field : " + demo.protectedField);
        System.out.println("Default Field   : " + demo.defaultField);

        System.out.println("\nCalling accessible methods:");
        demo.showPublicField();
        demo.showProtectedField();
        demo.showDefaultField();
        demo.showPrivateField();

        // Not allowed: privateField is accessible only inside
        // the AccessModifiersDemo class.
        // System.out.println(demo.privateField);
    }
}
