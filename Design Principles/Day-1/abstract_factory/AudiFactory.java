package abstract_factory;

public class AudiFactory extends Factory{
	@Override
	public Tire makeTire() 
	{
		return new AudiTire();
	}

	@Override
	public Headlight makeHeadlight() 
	{
		return new AudiHeadlight();
	}
}
