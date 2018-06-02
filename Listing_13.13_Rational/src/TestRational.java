
public class TestRational
{
	public static void main(String[] args)
	{
		// Create and initialize two rational numbers r1 and r2
		Rational r1 = new Rational(1, 2);
		Rational r2 = new Rational(1, 2);
		
		// Display results
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}
}
