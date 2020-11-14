package Review08OPolimorphisms;
public class World {
	


public static void main(String[] args) {
		Human.planet="World";
		Human h1 =new Human("Turker");
		System.out.println("the best student is "+h1.name);
		
		//h1.planet="World";
		Human h2=new Human("Gulbahar");
		//h2.name="Gulkis";
		//h2.planet="Mars";
		
		System.out.println(h1.name+ " lives in " +h2.planet);
		System.out.println(h1.name+ " lives in " +h1.planet);
		
		Human t1=new Turkish("Alibay");
		System.out.println(t1.name+ " lives in Turkish");

		System.out.println("------now people talking----");
		//upcasting/widening/implicitly
		Human b1 =new Belarusian("Vitaly");
		b1.talk();
		
		//downcasting/narrowing/explicitly
		Belarusian bela=(Belarusian)b1;
		bela.pickMushrooms();
		
		//Human h3 =b1;//another method
		//h3.talk();
		h1.talk();
		h2.talk();
		t1.talk();
		b1.talk();
		///h3.talk();
		Human[]people=new Human[6];
		people[0]=h1;
		people[1]=h2;
		people[2]=t1;
		people[3]=b1;
		people[4]=new Turkish("vel");
		people[5]=new Belarusian("Olga");
        
		for(Human person:people) {
			person.talk();
		for (person instanceof Belarusian) {
			Belarusian belarus=(Belarusian)person;
			belarus.pickMushrooms();
		}else if (person instanceof Turkish) {
			Turkish turk=(Turkish)person;
			turk.makeBaklava();
		}}


