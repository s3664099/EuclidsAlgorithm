
public class Algo {
	
	int m;
	int n;
	
	//Sets the two numbers to be calculates
	public Algo(int m, int n)
	{
		this.m = m;
		this.n = n;
	}
	
	//A recursive operation
	public int calculate()
	{
		//if n is greater than 0
		//This is the escape clause
		if (n>0)
		{
			//Remembers the value of m
			int q=m;
			
			//switches the value
			m=n;
			
			//gets the mod of the two numbers
			n=q%n;
			
			//calls the function again
			calculate();
		}
		
		//returns the greatest common denominator
		return m;
	}

}
