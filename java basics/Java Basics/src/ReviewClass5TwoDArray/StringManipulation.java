package ReviewClass5TwoDArray;
public class StringManipulation {
public static void main(String[] args) {
		String str="Hello2! ";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		//str has not changed
		System.out.println(str);
		System.out.println(str.toLowerCase());
		
		System.out.println(str.equals("Hello2! "));
		System.out.println(str.equalsIgnoreCase("Hello2! "));
		
		System.out.println("------boolean---------");
		boolean starts=str.startsWith("he");
		System.out.println("str.startsWith(he) -> " + starts);
		System.out.println(str.endsWith("2! "));
		
		//Method chaining
		System.out.println("======================");
		str.toLowerCase().startsWith("she");
		System.out.println(starts);
		
		//str.charAt(index);
		System.out.println("=========char===========");
		char fifthCharacter=str.charAt(4);
		System.out.println(fifthCharacter);
		
		System.out.println("------reverse------------");
		String reverse="";
		char[]charArray=str.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
		reverse +=charArray[i];		
}
		System.out.println("revers is->"+ reverse);
		
		System.out.println("------indexOf----------");
		int index=str.indexOf("llo");
		System.out.println(index);
		
		System.out.println("------StringIndexOf-------");
		String example="Something inside here";
		int index2=example.indexOf("e",19);
		System.out.println(index2);
		
		
		
		
		
		
		
}}
