package com.syntax26Encapsulation;
public class RegistrationEndsWITH {

		 private String email;  
		 private String username="";  
		 private String password="Tuzik10";  
		 public String getEmail () {
		 return email; 
		 } 
		 public void setEmail (String email) {
		 if (!email.endsWith ("@yahoo.com")) {
		 System.out.println ("please use yahoo mail account"); 
		  } 
		 if (email.isEmpty()) {
		 System.out.println ("email cannot be empty");  
		 }
		 this.email = email;
		 }  
		 public String getUsername () {
		 return username;  
		 }
		 public String getPassword () {
			 return password; 
		 }
		 public void setUsername (String username) {
		 if ((username.isEmpty ()) || (username.length ()> 6)) {
		 System.out.println ("please input valid username");
		 //}else if(!(username.isEmpty()) || (username.length()> 0)){
			//System.out.println("username no found");
			 //}else {
				 //System.out.println("Soory !!! No found");
		 }}
		 public void setPassword (String password) {
			 if ((password.isEmpty ()) || (password.length()> 6)) {
			     System.out.println ("please input valid password");
			 //}else  //if(!(password.isEmpty()) || (password.length()> 6)){
			     //System.out.println("You joint saxessfull");
			// }else {
				 //System.out.println("Soory !!! No found");
				 
}}}
		
		