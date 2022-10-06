import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	// initialize scanner and create stable object
	Scanner scanner = new Scanner(System.in);
	Stable stable = new Stable();
	
	// Obtain address for stable
	System.out.println("What is the address of the stable?");
	stable.address = scanner.nextLine();

	// Ask user if they want to add horses
	System.out.println("Do you wish to add a horse to the stable?"); 
	char input = scanner.nextLine().charAt(0);

	// While user still wants to create horses, create horse object and add to stable
	while (Character.toLowerCase(input) == 'y') {
		//Set name of horse
		System.out.println("What is the name of the horse?");
		String horseName = scanner.nextLine();
		
		// Set weight of horse
		System.out.println("What is the weight of the horse?");
		double horseWeight = scanner.nextDouble();
		scanner.nextLine();
		
		// Set if horse is tame or not
		System.out.println("Enter true if the horse is tame or false if it is not.");
		boolean isTame = scanner.nextBoolean();
		scanner.nextLine();

		// Create new horse object with given input and add to stable
		Horse horse = new Horse(horseName, horseWeight, isTame);
		stable.addHorse(horse);

		// Ask user if they want to create another horse
		System.out.println("Do you wish to add a horse to the stable?");
		input = scanner.next().charAt(0);
		scanner.nextLine();
	}

	scanner.close();

	//Display horses
	for (int i = 0; i < stable.horses.size(); i++) {
		int horseNum = i + 1;
		System.out.println("Horse #" + horseNum + " Name: " + stable.horses.get(i).name + " Weight: " + stable.horses.get(i).weight + " Tame: " + stable.horses.get(i).tame);
	}
  }
}