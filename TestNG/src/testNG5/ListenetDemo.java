package testNG5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenetDemo {
@Test
public void test1() {
System.out.println("Test1");
Assert.assertTrue(true);
}
@Test
public void test2() {
System.out.println("Test2");
Assert.assertTrue(false);
}
}
