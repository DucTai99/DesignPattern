package translator;

public class VietnameseClient {
	public static void main(String[] args) {
		VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
		client.send("Xin Chào");
	}
}