class Parent {
    final void display() {
        System.out.println("\nThis is the final method of Parent class.");
    }
}

class Child extends Parent {
    // Cannot override the final method
    // void display() {
    //  System.out.println("This is Child class method.");
    // }

    void show() {
        System.out.println("This is a method of a Child class.");
    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Child c = new Child();

        c.display();
        c.show();
    }
}

