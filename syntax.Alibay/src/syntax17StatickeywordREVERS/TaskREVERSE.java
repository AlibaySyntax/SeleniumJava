package syntax17StatickeywordREVERS;
public class TaskREVERSE {

public static String rev(String str) {
String reverse="";
for(int i=str.length()-1; i>=0; i--) {
reverse+=str.charAt(i);	
}
return reverse;
}
public static void main(String[]args) {
TaskREVERSE.rev("CoronaVirus");
System.out.println(TaskREVERSE.rev("CoronaVirus"));
}

}

