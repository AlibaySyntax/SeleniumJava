package Selen12APOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selUtils.CommonMethods;
import selUtils.ConfigsReader;




public class LoginWithAdvansedXPath extends CommonMethods {

public static void main(String[] args) throws InterruptedException {

setUp();

// Identify username based on the parent
WebElement username=driver.findElement(By.xpath("//div[@id='divUsername']/input"));
sendText(username,ConfigsReader.getProperty("username"));

// Identify password based on the sibling
WebElement password=driver.findElement(By.xpath("//span[text()='password']/preceding-sibling::input"));
sendText(password,ConfigsReader.getProperty("password"));

//// Identify login based on parents previous sibling
//WebElement loginBtn=driver.findElement(By.xpath("//div[@id='divLoginHelpLink']following-sibling::div/input"));
//click(loginBtn);

// Identify login btn based on grandparent
WebElement loginBtn=driver.findElement(By.xpath("//form[@id='frmlogin']/div[5]/input"));
click(loginBtn);

Thread.sleep(6000);
tearDown();

}

}
