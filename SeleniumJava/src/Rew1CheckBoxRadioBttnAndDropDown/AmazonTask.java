package Rew1CheckBoxRadioBttnAndDropDown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selUtils.BaseClass;

public class AmazonTask extends BaseClass {

public static void main(String[] args) throws InterruptedException {
		
setUp();

WebElement searchDropDown=driver.findElement(By.id("searchDropdownBox"));
Select selectDD=new Select(searchDropDown);
List<WebElement>ddOptions=selectDD.getOptions();

for(WebElement option:ddOptions) {
String optionText=option.getText();
System.out.println(optionText);
}
selectDD.selectByVisibleText("books");
WebElement searchTextbox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
searchTextbox.sendKeys("Harry Potter");
WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit' ][ @class='nav-input']"));
searchButton.click();

List<WebElement> bookSerCheckBoxes=driver.findElements(By.className("a-spacing-micro"));
for(WebElement bookSerCheckBox:bookSerCheckBoxes) {
String checkboxText=bookSerCheckBox.getText();
if(!bookSerCheckBox.isSelected()&& checkboxText.equals("Unofficial Cookbook")) {
Thread.sleep(2000);
bookSerCheckBox.click();
break;
}
}



}
}
