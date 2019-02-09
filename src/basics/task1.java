package basics;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[] {1, 2, 6, 16, -3, 19, 42};
	
		int min = min(numbers);
		System.out.println(min);
		
		int max = max(numbers);
		System.out.println(max);
		
		int ave = aver(numbers);
		System.out.println(ave);
	}
	
	//function for min value
	public static int min(int[] num) {
		int i = num.length;
		int val = num[0];
		
		for(int n = 1; n < i ; n++) {
			if(num[n] < val) {
				val = num[n];
			}			
		}
		return val;
	}

	//function for max value
	public static int max(int[] num) {
		int i = num.length;
		int val = num[0];
		
		for(int n = 1; n < i ; n++) {
			if(num[n] > val) {
				val = num[n];
			}			
		}
		return val;
	}

	//function for average value
	public static int aver(int[] num) {
		int i = num.length;
		int val = 0;
		
		for(int n = 0; n < i ; n++) {
			val = val + num[n];			
		}
		//here probably should be double, but according to hint I cannot do this that way
		val = val /i;
		return val;
	}
}
