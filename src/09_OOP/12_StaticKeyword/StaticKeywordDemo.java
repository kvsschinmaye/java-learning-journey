class Counter {
    static int count = 0;

    Counter(){
        count++;
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        Counter c  = new Counter();
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println("\nTotal objects created : " + Counter.count);
    }
}