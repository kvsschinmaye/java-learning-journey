class Notification {
    void send(){
        System.out.println("\nSending a general notification");
    }
}

class EmailNotification extends Notification {
    @Override
    void send(){
        System.out.println("\nSending an email notification");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        EmailNotification en = new EmailNotification();
        en.send();
    }
}