package assignment2;

public class Program2_Greatestof3numberusingIfElse {

	public static void main(String[] args) {
		// nested if else
		int a=32,b=9,c=20;
		if(a>b)
		{ 
			if(a>c)
			{
				System.out.println("Greatest number is:"+a);
			}
			else
			{
				System.out.println("Greatest number is:"+c);
			}
			}
		else
			if(b>a)
			{ 
				if(b>c)
				{
					System.out.println("Greatest number is:"+b);
				}
				else
				{
					System.out.println("Greatest number is:"+c);
				}
				}
	}

}
