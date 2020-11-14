package syntax02DoubleDataTypes;
public class AlibayPounds {
public static void main(String[] args) {
		     
		String store= "Walmart";
		
		double  Cucumber=   5.96;
		float        Price1=   0.95f;
		double         Qty1= (Cucumber*Price1);
		
		int          Cittle=   1;
		double       Price2=   15.00;
		double         Qty2= (Cittle*Price2);
		int          Iphone=   1;           //peaces
		double       Price3=   825.25;
		double         Qty3= (Iphone*Price3);
		double       Orange=   1;
		double       Price4=   4.36;
		double         Qty4= (Orange*Price4);
		
		double     Total=(Qty1+Qty2+Qty3+Qty4);
		
System.out.println("The total:= "+Qty1+"$ + "+Qty2+"$ + "+Qty3+"$ + "+Qty4+"$ = "+Total+" Dollars.");
}}
