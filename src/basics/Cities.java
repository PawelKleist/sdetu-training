package basics;

public class Cities {

	public static void main(String[] args) {
		//declare and define an array
		String[] cities = {"New York", "San Francisco", "San Diego"};
		System.out.println(cities[2]);
		
		
		String[] countries;
		
		countries = new String[2];
		countries[0] = "USA";
		countries[1] = "Mexico";
		
		//Declare the array
		String[] states = new String[5];
		states[0]= "California";
		states[1]= "Ohio";
		states[2]= "Texas";
		states[3]= "Utah";
		states[4]= "New Jersey";

		int i=0;
		
		do {
			System.out.println(states[i]);
			i=i + 1;
		} while (i < 5);
		
		int j = 0;
		
		while(j < 5) {
			System.out.println("STATE at " + j + " : " + states[j]);
			j = j + 1;
		}
		
	}

}
