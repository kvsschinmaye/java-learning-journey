final class Bank {
    void display() {
        System.out.println("\nWelcome to ABC Bank!");
    }
}

// This will cause a compilation error:
// class SBI extends Bank {
// }

public class FinalClassDemo {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.display();
    }
}