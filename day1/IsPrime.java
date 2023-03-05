package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		boolean op = true;
		for (int i = 1; i <=a ; i++) {
			if (a%2==0) {
				op = true;
				System.out.println(a + "is a prime number");
				break;
				}
			else
				System.out.println(a + "is not a prime number");
			break;
			
		}
		
	}

}
