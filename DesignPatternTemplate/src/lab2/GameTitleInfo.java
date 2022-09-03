package lab2;

public class GameTitleInfo extends TitleInfo {

	public GameTitleInfo(String titleName) {
		this.setTitleName(titleName);
	}

	@Override
	protected String getTitleBlurd() {
		return ("Game: " + this.getTitleName());
	}

}
