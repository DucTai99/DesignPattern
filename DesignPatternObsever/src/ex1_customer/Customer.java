package ex1_customer;

public class Customer implements Obsever {
	private String name;
	private String phone;
//	private ProductInfo pro;

	public Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
//		pro.addObject(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public void Update(String info) {
		System.out.println("Thông báo tới khách hàng: " + getName() 
								+ "\nSố điện thoại: " + getPhone() 
								+ "\nSản phẩm: " + info);
		System.out.println("---------------------------------");
	}
}
