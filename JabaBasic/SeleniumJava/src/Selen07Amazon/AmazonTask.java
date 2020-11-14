package Selen07Amazon;

import java.util.List;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selUtils.BaseClass;

public class AmazonTask extends BaseClass {

public static void main(String[] args) throws Exception {
		
setUp();
WebElement serarchDropDown=driver.findElement(By.id("searchDropdownBox"));
Select selectDD=new Select(serarchDropDown);
List<WebElement>ddOptions=selectDD.getOptions();

for(WebElement option:ddOptions) {
	String optionText=option.getText();
	System.out.println(optionText);
}
selectDD.selectByVisibleText("Books");
WebElement searchTextbox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
searchTextbox.sendKeys("Harry Poter");
WebElement searchButton=driver.findElement(By.xpath("/input(@type='submit'][@class='navigate']"));
searchButton.click();

WebElement bookSeriesCheckboxes=driver.findElement(By.className("a-spacing-micro"));
for (WebElement bookSeriesCheckbox:bookSeriesCheckboxes) {
String checkboxText=bookSeriesCheckboxes.getText();
if(!bookSeriesCheckbox.isSelected()&& checkboxText.equals("Unofficial Cookbook")) {
Thread.sleep(2000);	
bookSeriesCheckbox.click();
}
}
}}

