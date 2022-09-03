package ex1_Furniture;

public class Client {

	public static void main(String[] args) {
		FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);

		Chair chair = factory.createChair();
		chair.create();

		FurnitureAbstractFactory factory2 = FurnitureFactory.getFactory(MaterialType.WOOD);

		Table table = factory2.createTable();
		table.create();
	}

}
