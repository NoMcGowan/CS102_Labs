package Lab;

public class IncorrectMessage
{

	public static void main(String[] args)
	{
		int a = 2, b = 8, c = 6;
		System.out.println(
		"Finding the largest number \n");
		if (a > b && a > c)
		System.out.println(
		a + " is the largest Number");
		else if (b > a && b > c)
		System.out.println(
		b + " is the largest Number");
		// The correct message should have
		// been System.out.println
		//(b+" is the largest Number");
		// to make logic
		else
		System.out.println(
		c + " is the largest Number");
	}

}
