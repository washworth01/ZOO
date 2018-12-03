package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo
{
	public static List<Animal> zooAnimals = new ArrayList<Animal>();

	
	public static void birdsOnly(List<Animal> listName)
	{
		 listName.stream()
		.filter(animal -> animal instanceof Bird)
		.forEach(System.out::println);
	}
	
	public static void mammalsOnly(List<Animal> listName)
	{
		 listName.stream()
		.filter(animal -> animal instanceof Mammal)
		.forEach(System.out::println);
	}
}
