package Sel10Screenshot11a12;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;

public class CommonMetods {

public static void selectCalendarDate(List<WebElement> element, String text) {
for(WebElement pickDate:element) {	
if(pickDate.isEnabled()) {
if(pickDate.getText().equals(text)) {
pickDate.click();
break;
}
}
}
}
}
