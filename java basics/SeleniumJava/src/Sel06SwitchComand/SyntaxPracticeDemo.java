package Sel06SwitchComand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeDemo {

public static void main(String[] args) {
		
WebDriver driver=BaseClass.setUp();

driver.switchTo().frame("FrameOne");
boolean logIsDis=driver.findElement(By.id("hide")).isDisplayed();
System.out.println("Logo inside frame is display: "+logIsDis);
driver.switchTo().defaultContent();
//driver.switchTo().parentFrame();<---work the same

driver.switchTo().frame("FrameTwo");
boolean enrolBtnIsEnabled=driver.findElement(By.className("enroll-btn")).isEnabled();
System.out.println("Enrol button inside frame Two is Enabled:: "+enrolBtnIsEnabled);

BaseClass.tearDown();
}
}
