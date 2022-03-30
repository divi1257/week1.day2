package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=4;
		boolean flag = true;
		
		for(int i=2; i<input; i++ ) {
			
		
			if(input%i==0) {
			
			{
				System.out.println("It is Not a Prime Number");
			}
			flag=false;
			break;
			
		}

	}
	
if(flag){
	System.out.println("It is a Prime Number");
}


	}
	}
