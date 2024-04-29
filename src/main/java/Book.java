  public class Book {
      private String title;
      private String author;
      private int yearPublished;
      private String genre;

      // Constructor
      public Book(String title, String author, int yearPublished, String genre) {
          this.title = title;
          this.author = author;
          this.yearPublished = yearPublished;
          this.genre = genre;
      }

      // Getter methods
      public String getTitle() {
          return title;
      }

      public String getAuthor() {
          return author;
      }

      public int getYearPublished() {
          return yearPublished;
      }

      public String getGenre() {
          return genre;
      }

      @Override
      public String toString() {
          return "Title=" + title + "\nAuthor=" + author + "\nYear Published=" + yearPublished + "\nGenre=" + genre;
      }
  }
