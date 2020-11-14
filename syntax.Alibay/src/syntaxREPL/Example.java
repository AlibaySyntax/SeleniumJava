package syntaxREPL;

import java.util.Iterator;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		//What will be the output of the program?

				TreeSet map = new TreeSet();
				map.add("one");
				map.add("two");
				map.add("three");
				map.add("four");
				map.add("one");
				Iterator it = map.iterator();
				while (it.hasNext() ) 
				{
				System.out.print( it.next() + " " );
				}

	}

}
