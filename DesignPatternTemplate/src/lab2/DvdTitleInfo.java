package lab2;

public class DvdTitleInfo extends TitleInfo {
	String star;
	char encodingRegion;
	
	public DvdTitleInfo(String titleName, String star, char encodingRegion) {
		super();
		this.setTitleName(titleName);
		this.setStar(star);	
		this.setEncodingRegion(encodingRegion);
	}
	
	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public char getEncodingRegion() {
		return encodingRegion;
	}

	public void setEncodingRegion(char encodingRegion) {
		this.encodingRegion = encodingRegion;
	}

	@Override
	protected String getTitleBlurd() {
		return ("DVD: " + this.getTitleName() + ", starring " + this.getStar());
	}
	
	@Override
	protected String getDvdEncodingRegionInfo() {
		return (", encoding region: " + this.getEncodingRegion());
	}
}
