
public class Practice01MathIterative implements Practice01Math
{
	public int fib(int n) throws Exception
	{	
		//Calculations for fibonacci function using Iterative
		if(n<0)
		{
			throw new Exception("Negative number");
		}
		if(n == 0 || n == 1 )
		{
			return n;
		}

		int a = 1;
    	int b = 1;
    	for(int i = 2 ; i < n ; i++) 
    	{
     	  	int c = a + b;
      		b = a;
      		a = c;

    	}
    	return a;

	}
	public int fact(int n) throws Exception
	{
		//Calculations for factorial function using Iterative
		if(n<0)
		{
			throw new Exception("Negative number");
		}

		else
		{
			int product = 1;
			for(int i = 1 ; i <= n ; i++)
			{
				product = product * i;
			}
			return product;
		}

		
	}




}