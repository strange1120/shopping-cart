import static org.junit.Assert.*;
import org.junit.Test;

public class ItemTest {

	@Test
	public void shouldBeAbleToCreateAnItem() {
		Item underTest = new Item("null", 0.00, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatGetNameReturnsName() {
		Item underTest = new Item("test", 0.00, 0);
		String check = underTest.getName();
		assertEquals("test", check);
	}
	
	@Test 
	public void assertThatGetPriceReturnsPrice() {
		Item underTest = new Item("null", 6.00 , 0);
		double check = underTest.getPrice();
		assertEquals(6.00, check, .01);
	}
	
	@Test 
	public void assertThatGetQuantityReturnsQuantity() {
		Item underTest = new Item("null", 0.00, 1);
		int check = underTest.getQuantity();
		assertEquals(1, check);
	}
	
	@Test
	public void assertThatGetTotalItemsReturnsItemSum() {
		Order underTest = new Order();
		underTest.addItem(new Item("test1", 5.00, 2));
		underTest.addItem(new Item("test2", 6.00,3));
		double check = underTest.getTotalPrice();
		assertEquals(11.00, check, .01);
	}
	@Test public void assertThatRemoveItemDetailsRemovesItemDetails() {
		Order underTest = new Order();
		underTest.addItem(new Item("Water Bottle", 5.99, 1));
		underTest.addItem(new Item("Backpack", 25.99, 1));
		underTest.removeItem("Backpack");
		int check = underTest.getSize();
		assertEquals(check, 1);
	}
	
}
