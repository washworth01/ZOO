package zoo;

public class Bird extends Animal
{
	//Attributes
	private int topSpeed;
	
	
	
	//Constructors
	public Bird(int age, int weight, String name, String species, int topSpeed)
	{
		super(age, weight, name, species);
		this.topSpeed = topSpeed;
	}
	
	public Bird(String species)
	{
		super(species);
	}
	//Methods
	
	public int getTopSpeed()
	{
		return topSpeed;
	}

}
