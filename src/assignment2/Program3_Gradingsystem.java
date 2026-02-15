package assignment2;

public class Program3_Gradingsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=89;
		if(marks >=90 && marks <=100)
		{
			System.out.println(marks+" = Grade A");
		}
		else if(marks >=75 && marks <=89)
		{
			System.out.println(marks+" = Grade B");
		}
		else if (marks>=50 && marks<=74)
		{
			System.out.println(marks+" = Grade C");
		}
		else if (marks<50)
		{
			System.out.println(marks+" = Fail");
		}
		else 
		{
			System.out.println(marks+" = doesnot exist");
		}
	}

}
