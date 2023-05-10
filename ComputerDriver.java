package lateInstanciation;

public class ComputerDriver {
	
	public static void main(String[] args) {
		
		Computer c1 = new Computer("Dell", "I5", "Windows", 8, 500);
		
		c1.displayComputer();
		
		c1.insertPendrive("Sony", 800, 32);
		
		c1.p1.displayPendrive();
	}
}
