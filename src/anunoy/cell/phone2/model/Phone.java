package anunoy.cell.phone2.model;

public class Phone {
	
	private String Name;
	private int quantity;
	private double Cost;
	
	
	public Phone(String phone, int quantity, double Cost) {
		this.Name = phone;
		this.quantity = quantity;
		this.Cost = Cost;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return Cost;
	}
	public void setCost(double cost) {
		Cost = cost;
	}
	
	
	
	
	
	

}
