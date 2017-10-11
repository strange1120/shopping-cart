import java.util.ArrayList;

public class Order {
	ArrayList<Item> items = new ArrayList<Item>();

	public void addItem(Item itemDetails) {
		items.add(itemDetails);
	}

	public double getTotalPrice() {

		double totalPrice = 0.00;
		for (Item itemDetails : items) {
			totalPrice += (itemDetails.getPrice() * itemDetails.getQuantity());
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
	public int getSize() {
		return items.size();
	}

	public void currentOrder() {
		for (Item itemDetails : items) {
			System.out.println(itemDetails);
		}
	}
}
