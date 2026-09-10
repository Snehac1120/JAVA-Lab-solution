package JAVA.lab9;

// import java.util.Scanner;
// class book{
//     // private String author_name;
//     void dis(){
        
//     }
// }
// public class lab9b4 {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);


//     sc.close();
//     }
// }
import java.util.Scanner;

class Book {
    private String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthorName() {
        return author_name;
    }

    void display() {
        System.out.println("Book by author: " + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    BookPublication(String author_name, String title) {
        super(author_name);  
        this.title = title;
    }

    @Override
    void display() {
        System.out.println("Book Publication: \"" + title + "\" by " + getAuthorName());
    }
}

class PaperPublication extends Book {
    private String title;

    PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    void display() {
        System.out.println("Paper Publication: \"" + title + "\" by " + getAuthorName());
    }
}

public class lab9b4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of publications: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Book[] publications = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter type of publication (book/paper): ");
            String type = sc.nextLine().toLowerCase();

            System.out.print("Enter author name: ");
            String author = sc.nextLine();

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            if (type.equals("book")) {
                publications[i] = new BookPublication(author, title);
            } else if (type.equals("paper")) {
                publications[i] = new PaperPublication(author, title);
            } else {
                System.out.println("Invalid type! Defaulting to generic Book.");
                publications[i] = new Book(author);
            }
        }

        System.out.println("\nAll Publications:");
        for (Book pub : publications) {
            pub.display();  
        }

        sc.close();
    }
}