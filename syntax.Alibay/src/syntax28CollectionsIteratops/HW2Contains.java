package syntax28CollectionsIteratops;
import java.util.ArrayList;
public class HW2Contains {
public static void main(String[] args) {
ArrayList<String>drinks=new ArrayList<>();
drinks.add("woter");
drinks.add("milk");
drinks.add("water");
drinks.add("juice");
drinks.add("tea");
drinks.add("coffee");

for (int i=0; i<drinks.size(); i++) {
if(drinks.get(i).contains("e")||drinks.get(i).contains("a")) {
drinks.set(i,"tea");
} }
System.out.println(drinks);

System.out.println("----------------------------------");

ArrayList<String> drink=new ArrayList<>();
drink.add("COCE");
drink.add("BILO-Colo");
drink.add("ZELTSER");
drink.add("BILO-Colo");
drink.add("COCE");
drink.add("ORANGE");
drink.add("ZELTSER");
drink.add("MANGO-Colo");

for(String dr:drink) {
dr=dr.toLowerCase();
if(dr.contains("a")||dr.contains("e")) {
}
System.out.println(dr);
} } }
