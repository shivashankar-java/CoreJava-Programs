package pkg.csv;

public class Reader {
    private String id;
    private String name;
    private String email;
    private String age;

    public Reader(String id, String name, String email, String age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    
   
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String[] toCSVRow() {
        return new String[] { id, name, email, String.valueOf(age) };
    }


	@Override
	public String toString() {
		return "Reader [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
	

    
}


