package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int input = 123;
		int sum =0;
		int rem =0;
		while(input>0) {
			rem=input%10;
		    sum=rem+sum;
		    input=input/10;
			
			
			
			
		}
		System.out.println(sum);
		System.out.println(rem);

	}

}
