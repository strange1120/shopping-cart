import java.util.ArrayList;

public class Order {
	ArrayList<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public double getTotalPrice() {

		double totalPrice = 0.00;
		for (Item item : items) {
			totalPrice += (item.getPrice() * item.getQuantity());
		}
		return totalPrice;
	}

	public void removeItem(String name) {
		for (int i = items.size() - 1; i >= 0; i--) {
			if (items.get(i).getName().equals(name)) {
				items.remove(i);
			}
		}
	}

	public void changeQuantity(String name, int quantity) {
		int newQuantity = 0;
		for (Item item : items) {
			if (item.getName().equals(name)) {
				newQuantity = item.getQuantity() - quantity;
				item.setQuantity(newQuantity);
			}
		}
	}
	public int getSize() {
		return items.size();
	}

	public void currentOrder() {
		for (Item item : items) {
			System.out.println(item);
		}
	}
}
