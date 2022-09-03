package lab2;

public class BookTitleInfo extends TitleInfo {
	private String author;
	
	public BookTitleInfo(String titleName, String author) {
		this.setTitleName(titleName);
		this.setAuthor(author);
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	protected String getTitleBlurd() {
		return ("Book: " + this.getTitleName() + ", Author: " + this.getAuthor());
	}
}
