package Encapsulation;

public class MainSBIAccount {
  public static void main(String args[]) {
	  SBIAccount SBI = new SBIAccount();
	  
	  SBI.setAccountNo(952648769598l);
	  SBI.setName("shivashankar");
	  SBI.setAge(23);
	  SBI.setEmail("shivashankar.damidi@gmail.com");
	  
	   System.out.println(SBI.getAccountNo());
	   System.out.println(SBI.getName());
	   System.out.println(SBI.getAge());
	   System.out.println(SBI.getEmail());
	   
  }
}
