package com.syntax28CollectionsIteratop;
import java.util.ArrayList;
import java.util.Iterator;
public class HW2Iterator {
public static void main(String[] args) {
		
ArrayList<Integer>nums=new ArrayList<>();
for (int x =51; x<=100; x+=3) {
nums.add(x);
}
System.out.println(nums);
Iterator<Integer>n=nums.iterator();

while (n.hasNext()) {
if(n.next()%5==0) {
n.remove();
}
}
System.out.println(nums);
}
}
