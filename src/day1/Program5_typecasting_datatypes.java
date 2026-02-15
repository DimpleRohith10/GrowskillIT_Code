package day1;

public class Program5_typecasting_datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting-converting char to int
		char alpha='A';
		int alphaInt=alpha;
		System.out.println(alphaInt);
		
		//upcasting-converting int to float
		int age =45;
		float agefloat = age;
		System.out.println(agefloat);
		
		//downcasting-converting float to int
		float height =2134.6f;
		int heightInt= (int)height;
		System.out.println(heightInt);
		
		//downcasting--converting long to int(this gives wrong output because long has 8bytes and int has 4 bytes )
		long phoneNumber=987654321000000l;
		int phoneInt = (int)phoneNumber;
		System.out.println(phoneInt);

		
	}

}
