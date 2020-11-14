package syntax34ExceptionHandlingAndFuncDevs;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//
//public class TryCatchFinally {
//
//public static int division(int num,int num1){
//
//int result=0;
//try {
//result=num/num1;//new ArithmeticException
//System.out.println(result);
//
////}catch(ArithmeticException ae) {
////ae.printStackTrace();
////System.out.println(ae.getMessage());
//
//}finally {
//System.out.println("I am afinally block");	
//}	
//return result;
//}
//public static void read(String filePath) throws IOException {
//	
//FileInputStream fis=null;
//try {
//fis=new FileInputStream(filePath);
//Properties prop=new Properties();
//prop.load(fis);
//
//}catch(FileNotFoundException e) {
//e.printStackTrace();
//}catch(IOException e) {
//e.printStackTrace();	
//}finally {
//	try {
//		if(fis!=null) {
//			fis.close();
//		}
//	}catch(IOException e) {
//		e.printStackTrace();		
//	}
//}
//}}
