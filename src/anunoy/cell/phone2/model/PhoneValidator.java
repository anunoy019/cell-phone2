package anunoy.cell.phone2.model;

public class PhoneValidator {

	public static void phonevalidatorType(String inputPhoneType) {
		if (!inputPhoneType.equalsIgnoreCase(PhoneType.IPHONE.gettype())
				&& !inputPhoneType.equalsIgnoreCase(PhoneType.SAMSUNG.gettype())
				&& !inputPhoneType.equalsIgnoreCase(PhoneType.NOKIA.gettype())) {
			throw new PhoneAppException("Enter Valid input");
		}

	}
}
