import java.util.Scanner;

public class nested {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String gender;
		int age;
		String person;
		
		System.out.print("Enter the person's gender (male or female): ");
		gender = sc.nextLine();
		
		System.out.println("Enter the person's age: ");
		age = sc.nextInt();
		
		if (gender.equals("female"))
		{
			if (age < 21)
				person = "girl";
			else
				person = "woman";
		}
		
		else
		{
			if (age < 21 )
				person = "boy";
			else
				person = "man";
		}
		
		System.out.println("The person is a: " + person + "!");

	}

}
