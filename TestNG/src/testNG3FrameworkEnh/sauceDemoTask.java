package testNG3FrameworkEnh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.CommonMethods;

public class sauceDemoTask extends CommonMethods  {
	
@BeforeMethod
public void navigateToBrowser() throws InterruptedException {
setUp();
WebElement username=driver.findElement(By.id("user-name"));
username.sendKeys("standard_user");
WebElement password=driver.findElement(By.id("password"));
password.sendKeys("secret_sauce");
WebElement clickButton=driver.findElement(By.id("btn_action"));
clickButton.click();
wait(2);
}
@AfterMethod
public void closeBrowser() {
wait(2);
tearDown();

}
@Test(groups="smoke")
public void verify() {
String actualtitle="Products";
WebElement display=driver.findElement(By.className("product_lable"));
String expectedTitle=display.getText();
Assert.assertEquals(actualtitle, expectedTitle,"comparing the header with actual string");

}
@Test
public void select()  {
WebElement dropdown=driver.findElement(By.className("product_sort_container"));
Select select=new Select(dropdown);
select.selectByVisibleText("Price(low to high");
wait(10);


}
}

