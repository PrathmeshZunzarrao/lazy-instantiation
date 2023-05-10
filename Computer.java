package lateInstanciation;

public class Computer {

	String brand;
	String processor;
	String os;
	int ram;
	int rom;
	Pendrive p1;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	public Computer(String brand,String processor,String os,int ram,int rom)
	{
		this.brand = brand;
		this.processor = processor;
		this.os = os;
		this.ram = ram;
		this.rom = rom;
	}
	
	public void insertPendrive(String brand,int price,int size)
	{
		p1 = new Pendrive(brand,price,size);
		System.out.println("\n"+"Pendrive Inserted ");
	}
	
	public void displayComputer()
	{
		System.out.println("Computer's Specifications : ");
		System.out.println("Company Name : " + brand);
		System.out.println("Processor : " + processor);
		System.out.println("Operating System : " + os);
		System.out.println("Ram : " + ram);
		System.out.println("Rom : " + rom);
		
		System.out.println("===================================");
	}
}
