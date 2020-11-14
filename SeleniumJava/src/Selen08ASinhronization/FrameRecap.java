

package Selen08ASinhronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selUtils.BaseClass;

public class FrameRecap {

public static void main(String[] args) {
		
WebDriver driver=BaseClass.setUp();
boolean isHomeDis=driver.findElement(By.xpath("//a[@hrez='./index.html']")).isDisplayed();
System.out.println("Is Linke Displayed? "+isHomeDis);

driver.switchTo().defaultContent();
driver.switchTo().frame("FrameTwo");

boolean buttonEnabled=driver.findElement(By.xpath("//a[class='enroll-btn']")).isEnabled();
System.out.println("Is enroll Btn isEnabled "+buttonEnabled);
}
}
