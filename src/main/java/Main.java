
public class Main {
    public static void main(String[] args) {
        // Declare an array of Book objects
        Book[] books = new Book[5];

        // Fill the array with data
        books[0] = new Book("1984", "George Orwell", 1949, "Dystopian");
        books[1] = new Book("The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy");
        books[2] = new Book("Pride and Prejudice", "Jane Austen", 1813, "Romance");
        books[3] = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Drama");
        books[4] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Tragedy");

        // Search for a specific book title
        String searchTitle = "The Hobbit";

        // Use a for loop and an if statement to look for the book
        for (Book book : books) {
            if (book.getTitle().equals(searchTitle)) {
                System.out.println("Found the book: ");
                System.out.println(book.toString());
                break;
            }
        }
    }
}
