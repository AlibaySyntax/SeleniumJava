package testNG2Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class Mohamad {
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }


  @Test
  public void afterMethodTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforMethodTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void validLoginTest() {
    throw new RuntimeException("Test not implemented");
  }
}
