package syntax07LoopWhile;

public class PostAndPreIncrement1 {

	public static void main(String[] args) {
	//++,--
    // preincrement ++y,postincrement y++
		int z;
		int  y=10;
		z=y++;//postincrement= first use the variable
		System.out.println(y);
		
		int w;
		int x=10;
		w=++x;// first increment and then use it and assign
		System.out.println(x);
	
	System.out.println("&&&&&&&&&&&&&&&&&&&&&");
	int num=1;
	while(num<5) {
		++num;
		System.out.println(num);
		
}}}
