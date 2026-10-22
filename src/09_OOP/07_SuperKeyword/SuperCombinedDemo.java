class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }
    void makeSound(){
        System.out.println("\nAnimal makes a sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Dog barks");
    }

    void displayDetails() {
        System.out.println("\nAnimal Name : " + name);
        System.out.println("Dog Breed   : " + breed);
    }
}

public class SuperCombinedDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Bruno","Labrador");
        d.makeSound();
        d.displayDetails();
    }
}