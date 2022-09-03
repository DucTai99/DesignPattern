package ex1_Furniture;

public class PlasticFactory extends FurnitureAbstractFactory {

	@Override
	public Chair createChair() {
		return new PlasticChair();
	}

	@Override
	public Table createTable() {
		return new PlasticTable();
	}

}
