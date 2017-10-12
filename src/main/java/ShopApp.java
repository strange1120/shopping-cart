import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Order cartItems = new Order();

		System.out.println("Welcome to the Strange MarketPlace!");
		String selection = "";

		while (!selection.equalsIgnoreCase("n")) {
			System.out.println("Enter the name of an item: ");
			String name = input.nextLine();
			System.out.println("Enter the price of the item: ");
			double price = input.nextDouble();
			input.nextLine();
			System.out.println("Enter the quantity: ");
			int quantity = input.nextInt();
			input.nextLine();
			cartItems.addItem(new Item(name, price, quantity));
			currentCart(cartItems);
			System.out.println("Continue shopping? (y/n)");
			selection = input.nextLine();
		}
		System.out.println("Would you like to remove anything from your cart? (y/n)");
		selection = input.nextLine();
		finalCart(cartItems, selection);
		while (selection.equalsIgnoreCase("y")) {
			System.out.println("Enter the name of the item you would like to remove");
			String nameRemove = input.nextLine();
			System.out.println("How many of " + nameRemove + " would you like to remove?");
			int quantityRemove = input.nextInt();
			System.out.println("You have removed " + quantityRemove + "  " + nameRemove);
			cartItems.changeQuantity(nameRemove, quantityRemove);
			currentCart(cartItems);
			System.out.println("Would you like to remove anything else? (y/n)");
			input.nextLine();
			selection=input.nextLine();
			finalCart(cartItems, selection);
		}
	}

	public static void currentCart(Order cartItems) {
		System.out.println("Current Cart:");
		cartItems.currentOrder();
		System.out.println("Total Price: " + cartItems.getTotalPrice());
	}

	public static void finalCart(Order cartItems, String selection) {
		if (selection.equalsIgnoreCase("n")) {
			System.out.println("Thanks for shopping with us!");
			System.out.println("Here is your final shopping cart: ");
			cartItems.currentOrder();
			System.out.println("Your total price is " + cartItems.getTotalPrice());
		}
		
	}
}
