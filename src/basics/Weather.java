package basics;

public class Weather {
	public static void main(String[] args) 
	{
		int temperature = 65;
		String SunCondition = "Sunny";
		
		if(temperature >80)
		{
			System.out.println("Jest spoko.");
			
		}
		else if ((temperature > 60) && (SunCondition == "Sunny"))
		{
			System.out.println("Troszke pizdzi.");			
		}
		else
		{
			System.out.println("Jedz na lotnisko.");			
		}
		
		
	}

}
