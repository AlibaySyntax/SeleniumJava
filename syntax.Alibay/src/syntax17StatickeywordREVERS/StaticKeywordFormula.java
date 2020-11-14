package syntax17StatickeywordREVERS;

public class StaticKeywordFormula {

String color;
int memory;

static String cellphone;
	
static boolean bueaty;
	
	
static void anyWords() {
System.out.println(""+cellphone+" "+bueaty);
	}
	
void anyTypes() {
System.out.println(""+memory+" "+color);
	}	
public static void main(String[]args) {
		cellphone="iPhone";
		bueaty=true;
		
		StaticKeyword obj=new StaticKeyword();
		obj.color="grey";
		obj.memory=640;
	
		anyWords();//static void 
		obj.displaySpecifications();//void 	
}}
