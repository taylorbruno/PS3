package pkgLibrary;
//book exception
public class BookException extends Exception {
	private Book b;
	
	public BookException(){
		super();
	}
	
	public BookException(Book b){
		super("Not good.");
		this.b = b;
	}
	
	public Book B(){
		return b;
	}
}