package abstract_factory;

public abstract class Headlight {
	
	protected final String model;
	
	public Headlight(String headLightModel)
	{
		model = headLightModel;
	}
	
	public String getHeadlightModel()
	{
		return model;
	}
}
