package Library.pkg;

public class AgeCategory {
    private int ageCategoryId;
    private String categoryName;
    private int minAge;
    private int maxAge;
    
	public AgeCategory(int ageCategoryId, String categoryName, int minAge, int maxAge) {
		super();
		this.ageCategoryId = ageCategoryId;
		this.categoryName = categoryName;
		this.minAge = minAge;
		this.maxAge = maxAge;
	}

	public int getAgeCategoryId() {
		return ageCategoryId;
	}

	public void setAgeCategoryId(int ageCategoryId) {
		this.ageCategoryId = ageCategoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	@Override
	public String toString() {
		return "AgeCategory [ageCategoryId=" + ageCategoryId + ", categoryName=" + categoryName + ", minAge=" + minAge
				+ ", maxAge=" + maxAge + "]";
	}
    
    
}
