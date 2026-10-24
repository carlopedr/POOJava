
package POO.Encapsulacion;


public class Book {
    private String title;
    private int numPages;
    private Author author;

    public Book(String title, int numPages, Author author) {
        this.title = title;
        this.numPages = numPages;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", numPages=" + numPages + ", author=" + author + '}';
    }
    
    

}
