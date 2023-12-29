public class TestBook {
    public static void main(String[] args)
    {
        Book book = new Book("John Doe", "Sample Book", 2020);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());

        book.setAuthor("Jane Smith");
        book.setTitle("New Book");
        book.setYear(2021);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());
    }
}
