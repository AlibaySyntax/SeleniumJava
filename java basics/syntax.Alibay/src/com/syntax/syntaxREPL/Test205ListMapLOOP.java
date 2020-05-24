package com.syntax.syntaxREPL;

import java.util.*;
import java.util.Map.Entry;

public class Test205ListMapLOOP {
public static void main(String[] args) {
	List<Map<String, Object>> datalist = new ArrayList<Map<String,Object>>();
  Map<String, Object> appleMap = new HashMap<String, Object>();
	appleMap.put("Items", "Apple");
	Map<String, Object> appMap = new HashMap<String, Object>();
	appMap.put("Price", 20.00);
	Map<String, Object> applMap = new HashMap<String, Object>();
    applMap.put("Quantity",10);
    datalist.add(appleMap); 
    
  Map<String,Object> orangeMap = new HashMap<String, Object>();
	orangeMap.put("Items", "Orange");
	Map<String,Object> oranMap = new HashMap<String, Object>();
	oranMap.put("Price", 21.99);
	Map<String,Object> orangMap = new HashMap<String, Object>();
	orangMap.put("Quantity",10);
	datalist.add(orangeMap);	
	
Iterator<Map.Entry<String,Object>>org = appleMap.entrySet().iterator(); 
Map.Entry<String,Object> map =  org.next();	
for (Map.Entry<String, Object> entry : appleMap.entrySet()) {
for (Map.Entry<String, Object> entry1 : orangeMap.entrySet()) {	
    String k = entry.getKey();
    Object v = entry.getValue();
    double a =20.0;
    double b=10.0;
    //----------
    String x = entry1.getKey();
    Object y = entry1.getValue();
    double c =21.99;
    double d=10.0;
    double values= a*b;
    double values1=c*d;
    double sum=values+values1;
    System.out.print(""+k+": "+v+ " Price: "+a+  " Quantity: "+b );
    System.out.println(" SubTotal: " +values );
    System.out.print(""+x+": "+y+ " Price: "+c+  " Quantity: "+d );
    System.out.println(" SubTotal: " +values1 );
    System.out.print("Your Purchase total :"+sum);
}
}}}


