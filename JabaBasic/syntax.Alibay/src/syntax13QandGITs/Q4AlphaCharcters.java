package syntax13QandGITs;
public class Q4AlphaCharcters {
public static void main(String[] args) {
//Find out how many alpha characters are present in a String	
//Find number of words in String?
 
String str="Hih9898jhjh%%^$%^ oio  ";
str=str.replaceAll("[^A-Za-z]", "");
int number=str.length();
System.out.println("Number of alpha charcter = "+number);

String myString="Today is Wenesday русский";
String[]array=myString.split(" ");
int words=array.length;
System.out.println("Total words in String: "+myString+"+"+words);
}

}
