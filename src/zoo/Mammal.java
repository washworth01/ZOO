package zoo;

public class Mammal extends Animal
{
	//Attributes
	private String hairColour;
	
	
	
	//Constructors
	public Mammal(int age, int weight, String name, String species, String hairColour)
	{
		super(age, weight, name, species);
		this.hairColour = hairColour;
	}
		
	public Mammal(String species)
	{
		this(0, 0, "Teddy Roosevelt", species, "Red");
	}

	//Methods	
}
