package Library.pkg;

public class Book {
	private int bookId;
    private String title;
    private String author;
    private int rackId;
    private int ageCategoryId;
    
    
	public Book(int bookId, String title, String author, int rackId, int ageCategoryId) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.rackId = rackId;
		this.ageCategoryId = ageCategoryId;
	}

	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getRackId() {
		return rackId;
	}

	public void setRackId(int rackId) {
		this.rackId = rackId;
	}

	public int getAgeCategoryId() {
		return ageCategoryId;
	}

	public void setAgeCategoryId(int ageCategoryId) {
		this.ageCategoryId = ageCategoryId;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", rackId=" + rackId
				+ ", ageCategoryId=" + ageCategoryId + "]";
	}
    
    
}
