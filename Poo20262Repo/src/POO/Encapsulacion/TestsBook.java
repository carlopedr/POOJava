
package POO.Encapsulacion;


public class TestsBook {
    public static void main(String[] args) {
        Author a = new Author("GGM",1);
        System.out.println(a.toString());
        Book b= new Book("Cien años de soledad",500,a);
        System.out.println(b.toString());
    }

}
