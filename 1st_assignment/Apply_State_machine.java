import java.util.ArrayList;
import java.util.Scanner;

interface State {
	State next(OrderContext context);
}

class OrderContext {
	private ArrayList<String> orderNames = new ArrayList<>();
	private int cost = 0;
	private int orderNumber = 0;

	public ArrayList<String> getOrderNames() {
		return orderNames;
	}

	public void addOrderName(String orderName) {
		orderNames.add(orderName);
	}

	public int getCost() {
		return cost;
	}

	public void addToCost(int increment) {
		cost += increment;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void incrementOrderNumber() {
		orderNumber++;
	}
}

class WaitingForOrder implements State {
	public State next(OrderContext context) {
		System.out.println("Please enter a number to order:");
		System.out.println("1. Hawaiian Pizza)");
		System.out.println("2. Seafood Pizza");
		System.out.println("3. Americano");
		System.out.println("4. Latte");
		System.out.println("Enter 0 to exit");
		Scanner sc = new Scanner(System.in);
		int order = sc.nextInt();

		while (order != 0) {
			switch (order) {
				case 1:
					System.out.println("Hawaiian Pizza is ordered");
					context.addOrderName("Hawaiian");
					context.addToCost(51);
					context.incrementOrderNumber();
					break;
				case 2:
					System.out.println("Seafood Pizza is ordered");
					context.addOrderName("Seafood");
					context.addToCost(51);
					context.incrementOrderNumber();
					break;
				case 3:
					System.out.println("Americano is ordered");
					context.addOrderName("Americano");
					context.addToCost(13);
					context.incrementOrderNumber();
					break;
				case 4:
					System.out.println("Latte is ordered");
					context.addOrderName("Latte");
					context.addToCost(18);
					context.incrementOrderNumber();
					break;
				default:
					System.out.println("Invalid order");
			}
			System.out.println("Please enter a number to order:");
			System.out.println("1. Hawaiian Pizza");
			System.out.println("2. Seafood Pizza");
			System.out.println("3. Americano");
			System.out.println("4. Latte");
			System.out.println("Enter 0 to exit");
			order = sc.nextInt();
		}

		System.out.println("Order details: " + context);
		sc.close();
		return new ProduceProduct();
	}
}

class ProduceProduct implements State {
	public State next(OrderContext context) {
		System.out.println("____________________________________________________\n");
		System.out.println(context.getOrderNumber() + " items are ordered");
		System.out.println("Order is being prepared:");
		for (int i = 0; i < context.getOrderNumber(); i++) {
			switch(context.getOrderNames().get(i))
			{
				case "Hawaiian":
					Pizzafactory hawaiianFactory = new HawaiianFactory();
					Pizza hawaiian = hawaiianFactory.make();
					System.out.println("("+(i+1)+".)Hawaiian: " + hawaiian.getDescription());
					break;
				case "Seafood":
					Pizzafactory seafoodFactory = new SeafoodFactory();
					Pizza seafood = seafoodFactory.make();
					System.out.println("("+(i+1)+".)Seafood: " + seafood.getDescription());
					break;
				case "Americano":
					Coffeefactory americanoFactory = new AmericanoFactory();
					coffee americano = americanoFactory.make();
					System.out.println("("+(i+1)+".)Americano: " + americano.getDescription());
					break;
				case "Latte":
					Coffeefactory caffeLatteFactory = new LatteFactory();
					coffee caffeLatte = caffeLatteFactory.make();
					System.out.println("("+(i+1)+".)Latte: " + caffeLatte.getDescription());
					break;
			}
		}
		return new Serve();
	}
}

class Serve implements State {
	public State next(OrderContext context) {
		System.out.println("____________________________________________________\n");
		System.out.println("Product is served: " + context.getOrderNames());
		System.out.println("Total cost: " + context.getCost());
		return new WaitingForOrder();
	}
}

public class Apply_State_machine{
	public static void main(String[] args) {
		State stateMachine = new WaitingForOrder();
		OrderContext context = new OrderContext();
		stateMachine = stateMachine.next(context);
		stateMachine = stateMachine.next(context);
		stateMachine = stateMachine.next(context);
	}
}
