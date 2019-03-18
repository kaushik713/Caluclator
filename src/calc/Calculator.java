package calc;

public class Calculator {
	public double  addition(double a,double b)
	{
		return a+b;
	}
	public double  multiplication(double a,double b)
	{
		return a*b;
	}
	public double  division(double a,double b)
	{
		try {
			return a/b;
		}
		catch(ArithmeticException e)
		{
			throw new IllegalArgumentException("Can't divide with Zero");
		}
	}
}
