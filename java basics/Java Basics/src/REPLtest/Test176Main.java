package REPLtest;
public class Test176Main {

static String firstname;
static String lastname;
static String birthmonth;
static String birthday;
static String birthyear;
static String ssn;

public static void main(String[] args) {		
Test176Main ac=new Test176Main();
ac.firstname="John";
ac.lastname="Doe";
ac.birthmonth="10";
ac.birthday="25";
ac.birthyear="1900";
ac.ssn="123-45-6789";

//System.out.println(firstname+" "+lastname+" "+birthmonth+"/"+birthday+"/"+birthyear+" "+ssn);
System.out.println(firstname);
System.out.println(lastname);
System.out.println(birthmonth+"/"+birthday+"/"+birthyear);
System.out.println(ssn);
}}

