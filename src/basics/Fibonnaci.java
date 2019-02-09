package basics;

public class Fibonnaci {

	public static void main(String[] args) {
		// Fibonnaci 
		int sum = fib(8);
		System.out.println(sum);

	}
	
	public static int fib(int n) {
		if(n == 0) {
			return 0;
		}
		else {
			return (n + fib(n-1));
		}
	}

}
