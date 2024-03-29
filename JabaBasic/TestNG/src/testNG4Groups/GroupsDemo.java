package testNG4Groups;
import org.testng.Assert;
import org.testng.annotations.*;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class GroupsDemo {

@BeforeClass(alwaysRun=true)
public void beforeClass() {
System.out.println("beforeClass");
}
@AfterClass(alwaysRun=true)
public void afterClass() {
System.out.println("beforeClass");
}
@Test(dependsOnGroups= {"smoke"})
public void test1() {
System.out.println("test 1");
}
@Test(groups="smoke")
public void test2() {
System.out.println("test 2");
Assert.assertTrue(false);//If this test fails, test1 will be skipped

SoftAssert soft=new SoftAssert();
soft.assertTrue(false);
soft.assertAll();//This statement will collect all soft assert
                 //and decide if test passed or failed.
}
@Test(groups="regression")
public void test3() {
System.out.println("test 3");	
}	
@Test(groups= {"smoke","regression"})
public void test4() {
System.out.println("test 4");	
}	
}
