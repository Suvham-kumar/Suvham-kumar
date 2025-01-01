import java.util.*;


class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // Default to available when created
    }

    // Getters and setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }

    // Display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable);
    }
}
// Another Member Class
class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getName() { return name; }
    public String getMemberId() { return memberId; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    // Borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setAvailable(false);
        System.out.println(name + " borrowed the book: " + book.getTitle());
    }

    // Return a book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setAvailable(true);
        System.out.println(name + " returned the book: " + book.getTitle());
    }

    // Display member information
    public void displayMemberInfo() {
        System.out.println("Member Name: " + name + ", ID: " + memberId);
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            System.out.println("Borrowed Books:");
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}

// Another Library Class
class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    // Register a member to the library
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member registered: " + member.getName());
    }

    // FOR-EACH
    // for (Type item : collection) { The for-each loop is used when you need to iterate through each element of a collection.
    //     // Code block
    // }

    // Search for a book by title
    public Book searchBookByTitle(String title) {   
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Search for a member by ID
    public Member searchMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equalsIgnoreCase(memberId)) {
                return member;
            }
        }
        return null;
    }

    // Borrow a book
    public void borrowBook(String memberId, String bookTitle) {
        Member member = searchMemberById(memberId);
        Book book = searchBookByTitle(bookTitle);

        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
        } else if (book != null && !book.isAvailable()) {
            System.out.println("The book is currently not available.");
        } else {
            System.out.println("Member or book not found.");
        }
    }

    // Return a book
    public void returnBook(String memberId, String bookTitle) {
        Member member = searchMemberById(memberId);
        Book book = searchBookByTitle(bookTitle);

        if (member != null && book != null && !book.isAvailable()) {
            member.returnBook(book);
        } else {
            System.out.println("Member or book not found.");
        }
    }

    // Display all books in the library
    public void displayBooks() {
        for (Book book : books) {
            book.displayBookInfo();
        }
    }

    // Display all members in the library
    public void displayMembers() {
        for (Member member : members) {
            member.displayMemberInfo();
        }
    }
}

// Main Class1


public class Assignment3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        // Initial Instructions for the user
        System.out.println("Welcome to the Library Management System");
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a Book");
            System.out.println("2. Register a Member");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display All Members");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:  // Add a Book
                    System.out.println("Enter Book Title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter Book Author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter Book ISBN:");
                    String isbn = scanner.nextLine();

                    library.addBook(new Book(title, author, isbn));
                    break;

                case 2:  // Register a Member
                    System.out.println("Enter Member Name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter Member ID:");
                    String memberId = scanner.nextLine();

                    library.addMember(new Member(name, memberId));
                    break;

                case 3:  // Borrow a Book
                    System.out.println("Enter Member ID:");
                    String memberToBorrow = scanner.nextLine();
                    System.out.println("Enter Book Title to Borrow:");
                    String bookToBorrow = scanner.nextLine();

                    library.borrowBook(memberToBorrow, bookToBorrow);
                    break;

                case 4:  // Return a Book
                    System.out.println("Enter Member ID:");
                    String memberToReturn = scanner.nextLine();
                    System.out.println("Enter Book Title to Return:");
                    String bookToReturn = scanner.nextLine();

                    library.returnBook(memberToReturn, bookToReturn);
                    break;

                case 5:  // Display All Books
                    library.displayBooks();
                    break;

                case 6:  // Display All Members
                    library.displayMembers();
                    break;

                case 7:  // Exit
                    exit = true;
                    System.out.println("Exiting the Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}