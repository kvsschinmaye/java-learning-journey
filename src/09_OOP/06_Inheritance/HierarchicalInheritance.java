class Payment {
    double amount;

    void displayPayment(){
        System.out.println("\nPayment Amount : " + amount);
    }
}

class CardPayment extends Payment {
    String cardType;

    void displayCardPayment(){
        displayPayment();
        System.out.println("Card Type is   : " + cardType);
    }
}

class UPIPayment extends Payment {
    String upiId;

    void displayUPIPayment(){
        displayPayment();
        System.out.println("The UPI Id is  : " + upiId);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        CardPayment cp = new CardPayment();
        cp.amount = 1500.50;
        cp.cardType = "Credit Card";
        cp.displayCardPayment();

        UPIPayment up = new UPIPayment();
        up.amount = 750.00;
        up.upiId = "flora@upi";
        up.displayUPIPayment();

    }
}