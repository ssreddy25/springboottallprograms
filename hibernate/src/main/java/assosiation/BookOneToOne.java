package assosiation;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BookOneToOne {
	
	@Id
	private int bookId;
	private String bookName;
	private double bookPrice;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="author_id")
	private AuthorOneToOne author;
	
	
	public BookOneToOne(){}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public double getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}


	public AuthorOneToOne getAuthor() {
		return author;
	}


	public void setAuthor(AuthorOneToOne author) {
		this.author = author;
	}
	
	

	
}
