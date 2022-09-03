package lab2;

public abstract class TitleInfo {
	private String titleName;
	// the "template method"
	// calls the concrete class methods, is not overridden
	public final String processTitleInfo() {
		StringBuffer titleInfo = new StringBuffer();
		titleInfo.append(this.getTitleBlurd());
		titleInfo.append(this.getDvdEncodingRegionInfo());
		return titleInfo.toString();
	}
	
	// the following 2 methods are "concrete abstract class methods"
	public final void setTitleName(String titleNameIn) {
		this.titleName = titleNameIn;
	}
	
	public final String getTitleName() {
		return titleName;
	}
	
	// this is a "primitive operation", and must be overridden in the concrete templates
	protected abstract String getTitleBlurd();
	
	// this is a "hook operation", which may be overridden, hook operations usually do nothing if not overridden
	protected  String getDvdEncodingRegionInfo() {
		return " " ;
	}
}
