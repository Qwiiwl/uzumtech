import java.util.*;

class Book {
    private int id;
    private String name;
    private String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" + "Name: " + name + "\n" + "Author: " + author;
    }
}

class Library {
    private Map<Integer, Book> books = new HashMap<>();
    private int nextID = 1;

    public void addBook(String name, String author) {
        Book book = new Book(nextID, name, author);
        books.put(nextID, book);
        nextID++;
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books");
        } else {
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    public void getBookId(int id) {
        Book book = books.get(id);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("ID not found");
        }
    }

    public void removeBook(int id) {
        if (books.remove(id) != null) {
            System.out.println("Id deleted");
        } else {
            System.out.println("ID not found");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Add book");
            System.out.println("2. All books");
            System.out.println("3. ID Search");
            System.out.println("4. Delete book");
            System.out.println("0. Exit");
            System.out.print("Enter a number: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter a Name of the book: ");
                    String title = sc.nextLine();
                    System.out.print("Enter a name of author: ");
                    String author = sc.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    library.getBookId(id);
                    break;
                case 4:
                    System.out.print("Enter ID for delete: ");
                    int delId = sc.nextInt();
                    sc.nextLine();
                    library.removeBook(delId);
                    break;
                case 0:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
}

