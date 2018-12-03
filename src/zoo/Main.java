package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import zoo.Animal;

public class Main 
{

	public static void main(String[] args)
	{
		Zoo.zooAnimals.add(new Dog(3, 5, "Franklin", "Bulldog", "Red"));
		Zoo.zooAnimals.add(new Cat(3, 7, "Dixon", "Tabi", "Blue"));
		Zoo.zooAnimals.add(new Raven("Thick-billed Raven"));
		Zoo.zooAnimals.add(new Raven(6, 5, "Qwentin", "Common Raven", 500));
		
		System.out.println("List of Animals" + '\n');
		Zoo.zooAnimals.stream()
		.forEach(System.out::println);
		
		System.out.println('\n'+ "List of Birds" + '\n');
		Zoo.birdsOnly(Zoo.zooAnimals);
		
		System.out.println('\n' + "List of Mammals" + '\n');
		Zoo.mammalsOnly(Zoo.zooAnimals);
	}

}
