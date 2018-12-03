package zoo;

public class Raven extends Bird implements MakeNoise
{
	//Attributes
	
	
	
	//Constructor
	public Raven(int age, int weight, String name, String species, int topSpeed) 
	{
		super(age, weight, name, species, topSpeed);
		makeNoise();
	}
	
	public Raven(String species)
	{
		// I think this is wrong
		super(species);
	}
	
	//Methods
	
	public String makeNoise()
	{
		return noise = "Squark";
	}
	
}
