package syntaxREPL;
public class Test175accountGettSetter {
public class Account {
private String name;
private String Email;
private String acc_no;	
private double amount;

public Account (String name,String acc_no,String Email,double amount) {
this.name=name;
this.acc_no=acc_no;
this.Email=Email;
this.amount=amount;
}
public Account() {	
}
public void amount() {	
System.out.println("amount");
}
public String getname() {
return name;
}
public void setname(String name) {
this.name=name;
}

public String getEmail() {
return Email;	
}
public void setEmail(String Email) {
this.Email=Email;
}

public String getacc_no() {
return acc_no;
}
public void setacc_no(String acc_no) {
this.acc_no=acc_no;
}
public double getamount() {
return amount;	
}
public void setamount(double amount) {
this.amount=amount;
}
}

	
}