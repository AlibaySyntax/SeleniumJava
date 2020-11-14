package syntax26Encapsulations;
import javax.swing.text.PasswordView;
public class Registration1 {

private String email;
private String userName;
private PasswordView id;

public String getEmail() {
return email;
}
public String getUserNamel() {
return userName;
}
public String getPassword1() {
return userName;
}
public void setEmail(String email) {
if(email.endsWith("Yahoo"))	{
this.email=email;
}else {
System.out.println("Only use  yahoo account");
}
}
public void setUserName(String userName) {
if(!userName.isEmpty()&& userName.length()>6){
this.userName=userName;
}else {
System.out.println("User name cannot be empty");
}}
public void setPassword(String password) {
if(password.isEmpty())	{
if(password.length()>6) {
if(!password.contains(userName)) {
this.userName=password;
}else {
System.out.println("cannot password contain usename");
}
}else {
System.out.println("Pasword shot");
}
}else {
System.out.println("Password cannot be empty");
}}}