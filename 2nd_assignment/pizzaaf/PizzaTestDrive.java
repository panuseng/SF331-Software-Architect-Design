import java.util.Scanner;

public class PizzaTestDrive {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BROWN = "\u001B[38;5;94m";
	public static final String ANSI_ORANGE = "\u001B[38;5;214m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		Scanner scanner = new Scanner(System.in);

		boolean keepOrdering = true;

		printImage();

		while (keepOrdering) {
			System.out.println("Select store (ny/chicago): ");
			String storeChoice = scanner.nextLine().toLowerCase();

			PizzaStore selectedStore;
			if (storeChoice.equals("ny")) {
				selectedStore = nyStore;
			} else if (storeChoice.equals("chicago")) {
				selectedStore = chicagoStore;
			} else {
				System.out.println("Invalid store selection. Defaulting to NY store.");
				selectedStore = nyStore;
			}

			System.out.println("Select pizza type (cheese/clam/pepperoni/veggie): ");
			String pizzaType = scanner.nextLine().toLowerCase();
			Pizza pizza = selectedStore.orderPizza(pizzaType);
			if (pizza != null) {
				System.out.println("You ordered a " + pizza + " Price: " + pizza.getCost() + "\n");
			} else {
				System.out.println("Invalid pizza type.");
			}
			System.out.println("--------------------------------------------------");
			System.out.println("Would you like to order another pizza? (yes/no): ");
			String response = scanner.nextLine().toLowerCase();
			if (response.equals("no")) {
				keepOrdering = false;
			}
		}

		scanner.close();
		System.out.println("Thank you for your order!");

	}

	public static void printImage() {
		int flagHeight = 6;
		int flagWidth = 9;

		System.out.println("\n\n");
		for (int i = 0; i < flagHeight; i++) {  System.out.print(ANSI_GREEN);
			for (int j = 0; j < flagWidth; j++) {System.out.print("#");}System.out.print(ANSI_WHITE);
			for (int j = 0; j < flagWidth; j++) {System.out.print("#");}System.out.print(ANSI_RED);
			for (int j = 0; j < flagWidth; j++) {System.out.print("#");}System.out.println(ANSI_RESET);
		}

		String[] pizza = {
			"\n\n" + ANSI_WHITE + "               " + ANSI_BROWN + "#######" + ANSI_RESET,
			ANSI_RED + "=============" + ANSI_BROWN + "###" + ANSI_YELLOW + "##" + ANSI_YELLOW + "####" + ANSI_BROWN + "##" + ANSI_RESET,
			ANSI_ORANGE + "===========" + ANSI_BROWN + "##" + ANSI_YELLOW + "##" + ANSI_RED + "O" + ANSI_YELLOW + "#####" + ANSI_RED + "O" + ANSI_YELLOW + "##" + ANSI_BROWN + "##" + ANSI_RESET,
			ANSI_YELLOW + "==========" + ANSI_BROWN + "#" + ANSI_YELLOW + "##" + ANSI_RED + "O" + ANSI_YELLOW + "#####" + ANSI_GREEN + "~" + ANSI_YELLOW + "##" + ANSI_RED + "O" + ANSI_YELLOW + "###" + ANSI_BROWN + "#" + ANSI_RESET,
			ANSI_GREEN + "==========" + ANSI_BROWN + "#" + ANSI_YELLOW + "#####" + ANSI_RED + "O" + ANSI_YELLOW + "#####" + ANSI_GREEN + "~" + ANSI_YELLOW + "###" + ANSI_BROWN + "#" + ANSI_RESET,
			ANSI_BLUE + "===========" + ANSI_BROWN + "##" + ANSI_YELLOW + "##" + ANSI_RED + "O" + ANSI_GREEN + "~" + ANSI_YELLOW + "####" + ANSI_RED + "O" + ANSI_YELLOW + "###" + ANSI_BROWN + "##" + ANSI_RESET,
			ANSI_PURPLE + "=============" + ANSI_BROWN + "###" + ANSI_YELLOW + "#######" + ANSI_BROWN + "###" + ANSI_RESET,
			ANSI_WHITE + "                " + ANSI_BROWN + "#######" + ANSI_RESET,
			"\n"
		};

		for (String line : pizza) {
			System.out.println(line);
		}
	}
}
