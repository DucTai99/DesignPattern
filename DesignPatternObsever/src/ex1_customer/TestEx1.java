package ex1_customer;

public class TestEx1 {

	public static void main(String[] args) {
		Customer c1 = new Customer("Nam", "0123456789");
		Customer c2 = new Customer("Tuấn", "0987654321");
		ProductInfo item1 = new ProductInfo("Điện thoại Nokia 6.1 Plus");
		ProductInfo item2 = new ProductInfo("Điện thoại Nokia 8.1 Plus");
		ProductInfo item3 = new ProductInfo("Laptop MSI 5000");
		item1.addObject(c1);
		item1.addObject(c2);
		item1.notiflyObject();
		item1.removeObject(c2);
		item2.addObject(c2);
		item3.addObject(c1);
		item1.notiflyObject();
		item2.notiflyObject();
		item3.notiflyObject();
	}

}
