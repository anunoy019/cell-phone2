package anunoy.cell.phone2.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneAPP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Enter Phone Brand name : ");
			String phoneBrand = sc.nextLine();

			Phone iphone = new Phone(PhoneType.IPHONE.gettype(), 2, 500.00);
			Phone samsung = new Phone(PhoneType.SAMSUNG.gettype(), 5, 600.00);
			Phone nokia = new Phone(PhoneType.NOKIA.gettype(), 5, 300.00);
			
			PhoneValidator.phonevalidatorType(phoneBrand);

			PhoneService phone1 = new PhoneServiceImpl();

			if (phoneBrand.equalsIgnoreCase(PhoneType.IPHONE.gettype())) {
				phone1.phoneService(iphone);
			} else if (phoneBrand.equalsIgnoreCase(PhoneType.SAMSUNG.gettype())) {
				phone1.phoneService(samsung);
			} else if ((phoneBrand.equalsIgnoreCase(PhoneType.NOKIA.gettype()))) {
				phone1.phoneService(nokia);
			} else {
				System.out.println("Please insert valid input");
			}
		} catch (InputMismatchException e) {
			System.out.println(e);
		} catch (PhoneAppException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
