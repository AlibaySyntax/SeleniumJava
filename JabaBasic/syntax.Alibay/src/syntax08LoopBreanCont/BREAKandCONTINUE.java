package syntax08LoopBreanCont;

public class BREAKandCONTINUE {
public static void main(String[] args) {
	
	//once i=4 --> we want to stop the loop
	System.out.println("---------break----------");
	for (int i=1; i<=10; i++) {
		if(i==3) {
		System.out.println("I am stopping Loop");
		break;	
		}
		System.out.println("I am inside of the loop");
		System.out.println(i);
	    }
        System.out.println("--------Continue-------");
        
        for(int y=1; y<=10; y++) {
        	if(y==2) {
        System.out.println("I am skipping iteration");
        continue;
       }
        //System.out.println("I am inside the LOOPs");
        System.out.println(y);
       }
       //write a program that print numbers from 1 to 20
       //i do not want to print 5,6,7
       System.out.println("--------Continue-example-----");
       
       for(int i=1; i<21; i++) {  
    	 if(i==5 || i==6 || i==7) {
    	 continue;
    	 }
    	 System.out.println(i); 
         }
     System.out.println("--------Continue-exa-----");
   //write a program that print numbers from 1 to 100
     //i do not want to print 35-55
     for(int i=1; i<100; i++) {  
    	 if(i>=35 && i<=55) {
    	 continue;
    	 }
    	 System.out.println(i); 
     
}}}

