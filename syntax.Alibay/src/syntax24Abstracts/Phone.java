package syntax24Abstracts;
public abstract class Phone {
//Implemented methods
public void call() {
System.out.println("Phone can make a call");		
}
public void text() {
System.out.println("Phone can  send text");
}
//Unimplemented methods=undefined method=abstract methods
public abstract void takePicture();

public abstract void playMusic();
}
class iPhone extends Phone {
@Override
public void takePicture() {
System.out.println("iPhone takes picture");	
}
@Override
public void playMusic() {
System.out.println("iPhone plays music using apple store");
}
}
class Samsung   extends Phone {
@Override
public void takePicture() {
System.out.println("Samsung takes picture");	
}
@Override
public void playMusic() {
System.out.println("Samsung plays music using google store");
}
}
