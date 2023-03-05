package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int s = 0;
		System.out.println(a);
		for (int i = 0; i < 11; i++) {
			 
			s=a+b;
			a=b;
			b=s;
			System.out.println(s);
			
		}
	}

}
