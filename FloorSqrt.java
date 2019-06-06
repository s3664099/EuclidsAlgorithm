
public class FloorSqrt {

	//The number to calculate
	int n;
	
	public FloorSqrt(int n)
	{
		this.n = n;
	}
	
	public int calculate()
	{
		//set the number we want to compare
		int i = 1;
		
		//checks to see whether the square of the counter is
		//less than the number we are checking
		while((i*i)<n)
		{
			i++;
		}

		//if it is greater, then we return the previous number as that is our answer.
		return i-1;

	}

}
