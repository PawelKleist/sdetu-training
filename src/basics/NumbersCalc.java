package basics;

public class NumbersCalc {
	
	public static void main(String[] args)
	{
		
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = MultiplyNumbers(numA, numB);
		System.out.println("The product of numbers is: " + product);
	}
	
	static void printName()
	{
		System.out.println("My name is Tim");
	}

	static void addNumbers( int numberA, int numberB)
	{
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
		
	}
	
	
	static int MultiplyNumbers(int numberA, int numberB)
	{
		int mult = numberA * numberB;
		return mult;
	}
	
}
