package Review08Abstracttion1;
public class World {

//private static  Belarusian {

public static void main(String[] args) {
		Human.planet="World";
		Human h1 =new Turkish("Turker");
		h1.talk();
		
		Human h2=new Belarusian("Vitaly");
		h2.talk();
		h2.sleep();
		
		Belarusian belarus =(Belarusian)h2;
		belarus.pickMushrooms();


}
}