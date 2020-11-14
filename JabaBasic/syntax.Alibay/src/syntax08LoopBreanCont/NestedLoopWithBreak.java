package syntax08LoopBreanCont;

public class NestedLoopWithBreak {

public static void main(String[] args) {
for (int i = 0; i < 10; i++) {
if (i == 4) {
break;
}
System.out.print(i+" ");
}

System.out.println("--------------------");

for (int i = 0; i <10; i+=1) {
if(i == 6) {
break;
}
System.out.print(i+" ");
}}}
	

