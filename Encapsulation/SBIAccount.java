package Encapsulation;

public class SBIAccount {
   private String Name;
   private String email;
   private long accountNo;
   private int age;
   
   
//  using setter and getters 
   public String getName() {
	return Name;
  }
   public void setName(String name) {
	this.Name = name;
  }
  public String getEmail() {
	return email;
  }
  public void setEmail(String email) {
	this.email = email;
  }
  public long getAccountNo() {
	return accountNo;
  }
  public void setAccountNo( long accountNo) {
	this.accountNo =  accountNo;
  }
  public int getAge() {
	return age;
  }
  public void setAge(int age) {
	this.age = age;
  }
}  
   
   
    
