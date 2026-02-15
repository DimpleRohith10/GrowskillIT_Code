package day2;

public class Program3_Else {
	public static void main(String[] args) {
		int age=18;
		if(age==18)
		{
			System.out.println("Congrats on your first vote");
		}
		if(age>18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You cannot vote");
		}
	}

	// if the first condition is satisfied and second condition is failed, it will prist first condition and move to else part.
	//if the first condition is failed and second condition is satisfied, it will print second condition and it is not moved to else part. 
}
