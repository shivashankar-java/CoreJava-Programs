package SerializationDeserialization;

import java.io.Serializable;

public class User implements Serializable{
   

   String userid;
   transient  String password;
   
  public User(String userid, String password) {
	this.userid = userid;
	this.password = password;
  }

    public String getUserid() {
	return userid;
 }

   public void setUserid(String userid) {
	this.userid = userid;
 }

  public String getPassword() {
	return password;
 }

  public void setPassword(String password) {
	this.password = password;
 }

 @Override
  public String toString() {
	return "User [userid=" + userid + ", password=" + password + "]";
 }  
}
