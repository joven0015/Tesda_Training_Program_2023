package bookShelves;

public class Book {
    public Book(){
        String title; String author; int yearPublished; double price;
    public Book(String title, String author, int yearPublished, double price) {
    this.title = title;
    this.author = author;
    this.yearPublished = yearPublished;
    this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", price=" + price +
                '}';

    }

}
