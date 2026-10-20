class LibraryItem {
    String title;

    void displayItem(){
        System.out.println("\nTitle of the Book  : " + title);
    }
}

class Book extends LibraryItem {
    String author;

    void displayBook(){
        displayItem();
        System.out.println("Author of the Book : " + author);
    }
}

class EBook extends Book {
    int pages;

    void displayEBook(){
        displayBook();
        System.out.println("Number of Pages    : " + pages);

    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        EBook eb = new EBook();
        eb.title = "Can We Be Strangers Again?";
        eb.author = "Shrijeet Shandilya";
        eb.pages = 232;

        eb.displayEBook();
    }
}