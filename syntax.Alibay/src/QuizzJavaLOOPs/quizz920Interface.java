package QuizzJavaLOOPs;

public class quizz920Interface {
	 interface HasExoskeleton {

		 abstract int getNumberOfSections();

		  }

		 abstract class Insect implements HasExoskeleton {

		   abstract int getNumberOfLegs();

		  }

		  public abstract class Beetle extends Insect {

		  int getNumberOfLegs() { return 6; }

		 }

		

}
