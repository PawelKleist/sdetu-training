package basics;

public class Factorial {

	public static void main(String[] args) {
		// Program is counting the factorial of fixed value
		int a = 5;
		int f = fac(a);
		
		
		System.out.println("Factorial of value: " + a + " is equal: " + f);
	}
	
	public static int fac(int i) {
		if(i == 0 || i == 1) {
			return 1;
		}
		else {
			return (i * fac(i-1));
		}
	}

}
