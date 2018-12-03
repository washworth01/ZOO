package zoo;

public class Cat extends Mammal implements MakeNoise
{
	//Attributes
	
	
	
	//Constructors
	public Cat(int age, int weight, String name, String species, String hairColour) 
	{
		super(age, weight, name, species, hairColour);
		makeNoise();
	}
	
	public Cat(String species) 
	{
		super(species);
		
	}
	//Methods
	
	public String makeNoise()
	{
		return noise = "Merowl";
	}
	
	
}

