interface Payment2 {
    void pay(double amount);
}

class UPIPayment1 implements Payment2 {
    @Override
    public void pay(double amount) {
        System.out.println("\nPayment of " + amount + " made using UPI");
    }
}

class CardPayment1 implements Payment2 {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using Card");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Payment2 up = new UPIPayment1();
        Payment2 cd = new CardPayment1();

        up.pay(500);
        cd.pay(1200);
    }
}