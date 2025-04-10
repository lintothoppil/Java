import java.util.Scanner;

class Publisher {
    String publisherName;

    public void readPublisher(Scanner sc) {
        System.out.print("Enter publisher name: ");
        publisherName = sc.nextLine();
    }

    public void displayPublisher() {
        System.out.println("Publisher: " + publisherName);
    }
}

class Book extends Publisher {
    String title;
    String author;

    public void readBook(Scanner sc) {
        readPublisher(sc);
        System.out.print("Enter book title: ");
        title = sc.nextLine();
        System.out.print("Enter author name: ");
        author = sc.nextLine();
    }

    public void displayBook() {
        displayPublisher();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Literature extends Book {
    public void readLiterature(Scanner sc) {
        System.out.println("Enter details for Literature book:");
        readBook(sc);
    }

    public void displayLiterature() {
        System.out.println("\n--- Literature Book Details ---");
        displayBook();
    }
}

class Fiction extends Book {
    public void readFiction(Scanner sc) {
        System.out.println("Enter details for Fiction book:");
        readBook(sc);
    }

    public void displayFiction() {
        System.out.println("\n--- Fiction Book Details ---");
        displayBook();
    }
}

public class BookInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Literature lit = new Literature();
        Fiction fic = new Fiction();

        lit.readLiterature(sc);
        fic.readFiction(sc);

        lit.displayLiterature();
        fic.displayFiction();
    }
}

