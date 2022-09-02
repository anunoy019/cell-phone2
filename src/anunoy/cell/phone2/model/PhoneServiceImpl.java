package anunoy.cell.phone2.model;

public class PhoneServiceImpl implements PhoneService {

	@Override
	public void phoneService(Phone phone1) {
		
		System.out.println(Constant.APP_PHONEAPP);
		System.out.println("Phone Name : " + phone1.getName());
		System.out.println("Quantity : " + phone1.getQuantity());
		System.out.println("Cost : " + phone1.getCost());
		double tax = 0.085;
		double totalTax = (phone1.getCost() * tax);
		System.out.println("TOtal Tax : " + totalTax);
		double Shipping = 29.99;
		System.out.println("Total Cost : " + (phone1.getCost() + totalTax + Shipping));

	}

}
