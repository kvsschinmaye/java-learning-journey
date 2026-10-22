class Notification1 {
    void send(){
        System.out.println("Sending Notification");
    }
}

class SMSNotification extends Notification1 {
    @Override
    void send(){
        System.out.println("\nSending SMS notification");
    }
}

class PushNotification extends Notification1 {
    @Override
    void send(){
        System.out.println("Sending push notification");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Notification1 n = new SMSNotification();
        n.send();
        n = new PushNotification();
        n.send();
    }
}