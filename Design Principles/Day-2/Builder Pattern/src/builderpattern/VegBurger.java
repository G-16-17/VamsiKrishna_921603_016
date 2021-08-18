package builderpattern;

public class VegBurger extends Burger {

	   @Override
	   public float price() {
	      return 45.0f;
	   }

	   @Override
	   public String name() {
	      return "Veg Burger";
	   }
	}