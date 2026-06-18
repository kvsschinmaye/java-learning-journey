public class AdditionOverloading {

    public int add(int a , int b)
    {
        return a+b;
    }

    public double add(double a , double b)
    {
        return a+b;
    }

    public int add(int a , int b , int c)
    {
        return a+b+c;
    }

    public double add(int a, double b)
    {
        return a + b;
    }

    public void display(int age, String name)
    {
        System.out.println("Age : " + age + ", Name : " + name);
    }

    public void display(String name, int age)
    {
        System.out.println("Name: " + name + ", Age : " + age);
    }

    public static void main(String[] args) {
        AdditionOverloading ao =  new AdditionOverloading();

        System.out.println("add(int,int) : " + ao.add(34,29));
        System.out.println("add(double,double) : " + ao.add(45.89,23.08));
        System.out.println("add(int,int,int) : " + ao.add(12,45,98));
        System.out.println("add(int,double) : " + ao.add(64,29.56));

        ao.display("Sai",20);
        ao.display(23,"Sri");

    }
}