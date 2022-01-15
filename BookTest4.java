

class Book
{
    private String name;
    private String ISBN;
    private String author;
    private String publisher;
    Book(String authorname,String isbn,String au,String pub)
    {
    	
    	name=authorname;
    	ISBN=isbn;
    	author=au;
    	publisher=pub;
    }
    void setname(String authorname) {
    	name=authorname;
    }
    void setisbn(String isbn) {
    	ISBN=isbn;
    }
    void setauthor(String au) {
    	author=au;
    }
    void setpublisher(String pub) {
    	publisher=pub;
    }
    String getname() {
    	return name;
    }
    String getisbn() {
    	return ISBN;
    }
    String getauthor() {
    	return author;
    }
    String getpublisher() {
    	return publisher;
    }
    void getBookInfo() {
    	System.out.println("Book name is  :"+name);
    	System.out.println("ISBN number is:"+ISBN);
    	System.out.println("Author name is:"+author);
    	System.out.println("Publisher is  :"+publisher);
    }
}
public class BookTest4 {

	public static void main(String[] args) {
		Book b[]=new Book[30];
		b[1]=new Book("Wings of Fire","4545","APJ Abdul Kalam","Herb");
		b[1].getBookInfo();


}

}

