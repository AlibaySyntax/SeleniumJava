package com.syntax.syntaxREPL;
public class Test174EncapsulationDemo {

	private int empSSn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getempSSN(){
    return empSSn;
    }

    public String getempName(){
        return empName;
    }

    public int getempAge(){
        return empAge;
    }

    public void setempAge(int newValue){
       empAge = newValue;
    }

   public void setempName(String newValue){
        empName = newValue;
    }

    public void setempSSN(int newValue){
    empSSn = newValue;
    }

    //public static class EncapsTest{ <---No need in Encapsulation
    public static void main(String args[]){
         Test174EncapsulationDemo obj = new Test174EncapsulationDemo();
         obj.setempName("Mario");
         obj.setempAge(32);
         obj.setempSSN(112233);
         System.out.println("Employee Name: " + obj.getempName());
         System.out.println("Employee SSN: " + obj.getempSSN());
         System.out.println("Employee Age: " + obj.getempAge());
    } 
}
