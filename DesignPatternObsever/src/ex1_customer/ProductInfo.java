package ex1_customer;

import java.util.ArrayList;
import java.util.List;

public class ProductInfo implements Subject {
	private String name;
	private List<Customer> customer = new ArrayList<Customer>();

	public ProductInfo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void addObject(Customer c) {
		if (c != null) {
			customer.add(c);
		}
	}

	@Override
	public void removeObject(Customer c) {
		if (c != null) {
			customer.remove(c);
		}
	}

	@Override
	public void notiflyObject() {
		for (Customer cus : customer) {
			if (cus != null) {
				String info = this.getName();
				cus.Update(info);
			}
		}
	}
	
	

}
