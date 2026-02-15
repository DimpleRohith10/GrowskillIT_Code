package day2;

public class Program4_ElseIf {

	public static void main(String[] args) {
		int age=18;
		if(age==18)
		{
			System.out.println("Congrats on your first vote");
		}
		else if(age>=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You cannot vote");
		}
//if the first condition is satisfied and second condition is also satisfied but only first condition will be printed when else if is given in second condition.
	}

}
