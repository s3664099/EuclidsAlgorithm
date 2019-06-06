//This program perfoms Euclids Algorithm
//This determines the greatest common denominator of two numbers

public class main {

	public static void main(String[] args) {
		
		//Creates a new function and feeds in the numbers to calculate
		Algo euclid = new Algo(1024, 800);
		
		//returns the answer
		System.out.println(euclid.calculate());
		
		FloorSqrt floor = new FloorSqrt(390);
		
		System.out.println(Math.sqrt(390));
		
		System.out.println(floor.calculate());

	}

}
