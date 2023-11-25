package bookShelves;

public class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String title, String author, int yearPublished, double price){
        {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    }

    @Override
    public String toString() {

        return

                "title : " + title + "\n"+
                "author : " + author + "\n"+
                "yearPublished : " + yearPublished + "\n"+
                "price : " + price +"\n";

    }
}
