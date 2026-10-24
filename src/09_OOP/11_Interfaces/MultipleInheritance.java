interface Controllable {
    void turnOn();
}

interface Connectable {
    void connectToWifi();
}

class SmartTV implements Controllable,Connectable {
    @Override
    public void turnOn(){
        System.out.println("\nSmart TV is turned on");
    }
    @Override
    public void connectToWifi(){
        System.out.println("Smart TV connected to WiFi");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartTV st = new SmartTV();
        st.turnOn();
        st.connectToWifi();
    }
}