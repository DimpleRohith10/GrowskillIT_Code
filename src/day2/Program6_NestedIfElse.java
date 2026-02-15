package day2;

public class Program6_NestedIfElse {

	public static void main(String[] args) {
		// Nested if statements
		int age=18; char gender ='F';
		if(age==18)
		{
			System.out.println("Congrats on your first vote");
			if(gender=='F')
			{
				System.out.println("Vote Girl");
			}
			else 
			{
				System.out.println("Vote boy");
			}
		}
		if(age>=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You cannot vote");
		}
	}

}
