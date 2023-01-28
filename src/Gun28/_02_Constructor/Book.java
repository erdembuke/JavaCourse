package Gun28._02_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    Book() {
        this("",0,"");
    }

    Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    Book(String name, int publishYear) {
        this(name,publishYear,"");
    }


    public String toString() {
        return name + " " + publishYear + " " + author;
    }
}
