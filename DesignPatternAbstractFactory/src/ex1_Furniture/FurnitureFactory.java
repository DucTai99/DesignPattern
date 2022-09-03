package ex1_Furniture;

public class FurnitureFactory {
	public FurnitureFactory() {
	}

	// Returns a concrete factory object that is an instance of the
	// concrete factory class appropriate for the given architecture.
	public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
		switch (materialType) {
		case WOOD:
			return new WoodFactory();
		case PLASTIC:
			return new PlasticFactory();
		default:
			throw new UnsupportedOperationException("This furniture is unsupported ");
		}
	}
}
