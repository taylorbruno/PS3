
import static org.junit.Assert.*;

import java.util.Date;
import java.util.Map;

import org.junit.Test;

import pkgLibrary.Book;
import pkgLibrary.BookException;

public class BookTests {

	@Test
	public void GetBook1() {
		Book bk = new Book("bk101");
		assertTrue(bk.GetBook("bk101").equals(bk));
	}
	
	@Test
	public void GetBook2() {
		Book bk = new Book("bk101");
		assertNotEquals(bk.GetBook("bk102"), bk);
	}
	
	@Test
	public void AddBook1() {
		Book bk = new Book("bk999", "Taylor", "My Life", "bio", 100.00, new Date(1,1,1,1,1), "Life");
		bk.AddBook("bk999", bk);
		assertTrue((bk.GetBook("bk999") != null) && (bk.GetBook("bk999").equals(bk)));
	}
	
	@Test
	public void AddBook2() {
		Book bk = new Book("bk999", "Taylor", "My Life", "bio", 100.00, new Date(1,1,1,1,1), "Life");
		bk.AddBook("bk999", bk);
		assertFalse((bk.GetBook("bk99") != null) && (bk.GetBook("bk99").equals(bk)));

	}
}