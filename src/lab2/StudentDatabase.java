package lab2;

public class StudentDatabase {

	public static void main(String[] args) {
		
		StudentData Student1 = new StudentData("Joe", "56823945");
		Student1.setUserID();
		Student1.setCity("Montana");
		Student1.getCity();
		Student1.enroll("Math");
		Student1.enroll("English");
		Student1.showCourses();
		Student1.pay(200);
		Student1.pay(200);
		Student1.checkBalance();
		System.out.println(Student1.toString());
		
	}
}

class StudentData {
	//Properties of StudentData class
	private static int statID = 1000;
	private String userID;
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private double balance;
	
	
	//Constructor
	public StudentData(String name, String SSN) {
		System.out.println("New Student added successfully!");
		statID++;
		System.out.println("Your static ID is: " + statID);
		this.name = name;
		this.SSN = SSN;
		this.email = name + "@uni.com";
		System.out.println("Your new email adress is: " + this.email);
	}
	
	public void setUserID() {
		int random = 0;
		do {
			random = (int) (Math.random() * 10000 + Math.random() * 1000 + Math.random() * 100 + Math.random() * 10);
		}while (random < 1000 && random > 9000);
		
		/*while (random < 1000 & random > 9000) {
			
			random = (int) (Math.random() * 10000 + Math.random() * 1000 + Math.random() * 100 + Math.random() * 10);
		}*/
		
		System.out.println(random);
		this.userID = statID + "" + random + "" + this.SSN.substring(4);
		System.out.println(this.userID);
	}
	
	public String getPhone() {
		System.out.println("Your phone number is: " + phone);
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println("Your phone number is: " + phone);
	}

	public String getCity() {
		System.out.println("Your city is: " + city);
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("Your city is: " + city);
	}

	public String getState() {
		System.out.println("Your state is: " + state);
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("Your state is: " + state);
	}
	
	public void enroll(String course) {
		courses = courses + course + ", ";
		System.out.println("You enrolled for a course: " + course);
	}
	
	public void pay(int amount) {
		System.out.println("We got your payment for...we do not know what: $" + amount);
		this.balance = this.balance + amount;
	}
	
	public void checkBalance() {
		System.out.println("Your balance is: $" + balance);
	}
	
	public void showCourses() {
		System.out.println("Your courses: " + courses);
	}
	
	public String toString() {
		return "[ Name: " + name + " ]\n[ User ID: " + userID + " ]\n[ Email: " + email + " ]\n[ Balance: " + balance + " ]";
	}
}