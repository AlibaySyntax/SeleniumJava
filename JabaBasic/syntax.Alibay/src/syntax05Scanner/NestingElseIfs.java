package syntax05Scanner;

public class NestingElseIfs {

	public static void main(String[] args) {
	
		//* if student completed a quiz check for a score
		/* if score >90 --> great job
		* if score >80 --> well done
		* if score .70 --> you could have done better
		*
		* if student did not completed the quiz --> not good
		* please do homework online
		*/
		
		boolean  quizComleted=false;
		int score=86;
		//Если больше/меньше пишем в скобках.
		
		     if    (score>90) {
		         System.out.println("great job, you stady a lot");
		         
             }else if(score>80) {
		    	 System.out.println("well done"); 
		    	 
		     }else if(score>70) {
		    	 System.out.println("You could have done better ");
		    		 
		     }else   {
	              System.out.println("You faled"); }
}}

	         
	
