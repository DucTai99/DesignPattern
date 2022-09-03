package lab1;

public class SimpleStringDecorator extends StringDecorator {

	@Override
	protected char getBottomCharacter() {
		return '#';
	}

	@Override
	protected char getRightCharacter() {
		return ')';
	}

	@Override
	protected char getLeftCharacter() {
		return '(';
	}

	@Override
	protected char getTopCharacter() {
		return '#';
	}
	
	@Override
	protected String getString() {
		return "taihandsome";
	}
	
	public static void main(String[] args) {
		StringDecorator decorator = new SimpleStringDecorator();
		decorator.decorate();
	}
}
