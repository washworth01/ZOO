package zoo;

public class Dog extends Mammal implements MakeNoise
{
	//Attributes
	
	
	
	//Constructors
	public Dog(int age, int weight, String name, String species, String hairColour) 
	{
		super(age, weight, name, species, hairColour);
		makeNoise();
	}
	
	public Dog(String species) 
	{
		super(species);
	}
	
	//Methods
	
	public String makeNoise()
	{
		return noise = "Brark";
	}
	
}
