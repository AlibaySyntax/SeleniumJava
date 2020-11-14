package testNG5;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
//@Override
public void onTestStart(ITestContext context) {
System.out.println("Functionaly Testing Started ");
}	
@Override
public void onTestStart(ITestResult result) {
System.out.println("Test Started "+result.getName());
}
@Override
public void onTestSuccess(ITestResult result) {
System.out.println("Test Pased "+result.getName());
}
@Override
public void onTestFailure(ITestResult result) {
System.out.println("Test Failed "+result.getName());
}}