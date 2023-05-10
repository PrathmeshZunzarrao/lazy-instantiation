package lateInstanciation;

public class Pendrive {
	
	String brand;
	int price;
	int size;
	
	public Pendrive() {
		// TODO Auto-generated constructor stub
	}
	
	public Pendrive(String brand,int price,int size) 
	{
		this.brand = brand;
		this.price = price;
		this.size = size;
	}
	
	public void displayPendrive()
	{
		System.out.println("Pendrive Specification's : ");
		System.out.println("Company Name : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Storage Capacity : " + size);
		
		
		System.out.println("===================================");
	}
}
