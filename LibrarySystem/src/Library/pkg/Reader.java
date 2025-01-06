package Library.pkg;

public class Reader {
    private int readerId;
    private String name;
    private int age;
    private int borrowedBookId;
    
	public Reader(int readerId, String name, int age, int borrowedBookId) {
		super();
		this.readerId = readerId;
		this.name = name;
		this.age = age;
		this.borrowedBookId = borrowedBookId;
	}
	
	public int getReaderId() {
		return readerId;
	}
	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBorrowedBookId() {
		return borrowedBookId;
	}
	public void setBorrowedBookId(int borrowedBookId) {
		this.borrowedBookId = borrowedBookId;
	}

	@Override
	public String toString() {
		return "Reader [readerId=" + readerId + ", name=" + name + ", age=" + age + ", borrowedBookId=" + borrowedBookId
				+ "]";
	}

    
}

