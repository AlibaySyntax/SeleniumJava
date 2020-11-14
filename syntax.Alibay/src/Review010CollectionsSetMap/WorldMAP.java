package Review010CollectionsSetMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WorldMAP {

public static void main(String[] args) {
// MAP execute curve Brackets
System.out.println("---Curve brackets in Map (europe)---");
Map<String,String> europe=new HashMap<>();
europe.put("France", "Paris");
europe.put("Italy", "Rome");
europe.put("Germany", "Berlin");
System.out.println(europe);

System.out.println();
// SET execute Square Brackets
System.out.println("---Square brackets in Set---");
Set<Entry<String,String>>entries=europe.entrySet();
System.out.println(entries);

System.out.println();

System.out.println("---Curve brackets in Map (africa)---");
Map<String,String> africa=new HashMap<>();
africa.put("Morocco", "Rabat");
africa.put("Egypt", "Cairo");
africa.put("Tunisia", "Tunis");
System.out.println(africa);

System.out.println();

System.out.println("---Curve brackets in Map (africa)---");
Map<String,String> asia=new HashMap<>();
asia.put("China", "Pekin");
asia.put("Turkmenistan", "Ashabat");
asia.put("Japan", "Tokyo");
System.out.println(asia);

System.out.println();

System.out.println("----WORLD----");
List<Map<String,String>>world=new ArrayList<>();
world.add(europe);
world.add(africa);
world.add(asia);
//System.out.println(world);

for(Map<String,String>continentMap:world) {
//System.out.println(continent);	
Set<String> countryNames=continentMap.keySet();
for(String country:countryNames) {
System.out.println(country+" "+continentMap.get(country));
}
System.out.println();
}
}
}
