package abstract_factory;

public class MercedesFactory extends Factory {
	
	@Override
	public Tire makeTire() 
	{
		return new MercedesTire();
	}

	@Override
	public Headlight makeHeadlight() 
	{
		return new MercedesHeadlight();
	}

}
