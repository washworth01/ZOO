package zoo;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal
{
	//Attributes
	protected int age;
	protected int weight;
	protected String species;
	protected String name;	
	protected String noise = null;
	
	//Constructors
	public Animal(int age, int weight, String name, String species)
	{
		this.species = species;
		this.age = age;
		this.weight = weight;
		this.name = name;
	}

	public Animal(String species)
	{
		this.species = species;
		this.age = 0;
		this.weight = 0;
		this.name = "Teddy Roosevelt";
	}

	//Methods
	
	public String toString() 
	{
		if (noise != null)
		{
			return ("Name: " + name + " Species: "+ species + ", present? " + noise);
		}
		else
		{
			return ("Name: " + name + " Species: " + species + ", present?");
		}
	}
	
	public String getName()
	{
		return name;
	}
}
