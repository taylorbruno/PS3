package pkgLibrary;

public class BookException extends Exception {
	private Book b;
	
	public BookException(){
		super();
	}
	
	public BookException(Book b){
		super("bad");
		this.b = b;
	}
	
	public Book B(){
		return b;
	}
}