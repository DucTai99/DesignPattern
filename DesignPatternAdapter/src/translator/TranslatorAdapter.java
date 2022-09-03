package translator;

public class TranslatorAdapter implements VietnameseTarget {
	private JapaneseAdaptee adaptee;

	public TranslatorAdapter(JapaneseAdaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void send(String words) {
		System.out.println("Reading Words ...");
		System.out.println(words);
		String vietnameseWords = this.translatate(words);
		System.out.println("Sending Words ... ");
		adaptee.receive(vietnameseWords);
	}

	private String translatate(String words) {
		System.out.println("Translated!");
		return "こんにちは";
	}
}
