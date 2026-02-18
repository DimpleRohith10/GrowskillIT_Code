package assignment3;

public class Program4_countevenandoddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2458763;
		int evencount=0;
		int oddcount=0;
		while(num>0)
		{
			int digit=num%10;
			if(digit%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("EvenCount:"+ evencount);
		System.out.println("Oddcount:" +oddcount);
	}

}
