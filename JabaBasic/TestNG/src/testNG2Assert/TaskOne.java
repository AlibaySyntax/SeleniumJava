package testNG2Assert;

import org.testng.annotations.Test;

public class TaskOne {
/*	
   Create a class TaskOne that has 5 test methods named:
   firstMethod
   firstMethod1
   secondMethod
   thirdMethod
   fourthMethod
   And each of them printing the method name
   Run and observe results
   
   Then, add the needed attributes to print the following result:
   fourMethod
   thirdMethod
   firstMethod
*/

@Test
public void firstMethod() {
System.out.println("firstMethod");
}
@Test
public void firstMethod1() {
System.out.println("firstMethod1");
}
@Test
public void secondMethod() {
System.out.println("secondMethod");
}
@Test
public void thirdMethod() {
System.out.println("thirdMethod");
}@Test
public void fourthMethod() {
System.out.println("fourthMethod");	
}
}
