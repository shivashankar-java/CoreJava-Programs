package pkg.csv;

public class Rack {
    private String id;
    private String location;

    public Rack(String id, String location) {
        this.id = id;
        this.location = location;
    }
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

   public void setLocation(String location) {
		this.location = location;
	}
	
	public String[] toCSVRow() {
        return new String[] { id, location };
    }
}
   


