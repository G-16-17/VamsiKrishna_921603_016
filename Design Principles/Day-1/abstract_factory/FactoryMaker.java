package abstract_factory;

public class FactoryMaker {
	public static Factory getFactory(String factoryName)
	{
		if(factoryName.equalsIgnoreCase("audi"))
			return new AudiFactory();
		else if(factoryName.equalsIgnoreCase("mercedes"))
			return new MercedesFactory();
		else
			return null;
	}
}
