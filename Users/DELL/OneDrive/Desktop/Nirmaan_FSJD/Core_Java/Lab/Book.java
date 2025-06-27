package Lab;

public class Book {
	String title;
	String Author;

	public Book() {
		
	}
	public Book(String t, String a) {
		title = t;
		this.Author = a;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", Author=" + Author + "]";
	}
	
}
