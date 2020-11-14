package syntax24Abstracts;
public class PhoneTest {

public static void main(String[] args) {
//=new Phone(); CE: Cannot create an Object of Phone class because it ABSTRACT
Phone iphone=new iPhone();
iphone.call();
iphone.text();
iphone.takePicture();
iphone.playMusic();

Phone samsung=new Samsung();
samsung.call();
samsung.text();
samsung.takePicture();
samsung.playMusic();


}

}
