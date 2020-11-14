package syntax10Arrays;

public class RetrievingValuesFrom2Darrays {

	public static void main(String[] args) {
		
		String month[][]= {
				{"January","Febraury","December"},  //this 0
				{"March","April","May"},            //this 1
				{"June","July","Audust"},           //this 2
				{"September","October","November"}	//this 3	
		};
		int rows=month.length;//how many arrays
		int firstArray=month[3].length;
         System.out.println(firstArray);  
        
         for(int i=1; i<month.length; i++) {
         for(int j=0; j<month.length; j++) {
         System.out.println(month[i][j]+"");
         }
         System.out.println();
}}}
