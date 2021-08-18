package builderpattern;

public class Coke extends ColdDrink {

	   @Override
	   public float price() {
	      return 25.0f;
	   }

	   @Override
	   public String name() {
	      return "Coke";
	   }
	}