package anunoy.cell.phone2.model;

public enum PhoneType {

	NOKIA("nokia"), IPHONE("iphone"), SAMSUNG("samsung");

	private String type;

	PhoneType(String type) {
		this.type = type;
	}

	public String gettype() {
		return type;
	}

}
