package pkg.LibraryAssignment;

public class AgeCategory {
    private String id;
    private String categoryName;

    
    
    public AgeCategory(String id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
	}

    public String getId() {
		return id;
	}

       public void setId(String id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String[] toCSVRow() {
        return new String[] { id, categoryName };
    }

	@Override
	public String toString() {
		return "AgeCategory [id=" + id + ", categoryName=" + categoryName + "]";
	}
	
}


