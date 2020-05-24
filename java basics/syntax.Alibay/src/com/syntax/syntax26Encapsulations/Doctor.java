package com.syntax.syntax26Encapsulations;

public class Doctor {

private long licenseID;
private long phoneNumber;
private String email;

public void Email(String email) {
if(!email.contains("gmail")) {
if(email.contains("gmail")) {
this.email=email;

//public String getEmail=email;
}else {
System.out.println("email cannot be of gmail type");
}
}else {
System.out.println("Email cannot be empty");
}}
public String getEmail() {
return email;
}}