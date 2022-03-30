package week1.day2;

public class Calculator {
	
	
	public int add() {
		
        int num1=10;
        int num2=20;
        int num3=30;
        int add1=num1+num2+num3;
        return add1;
	}
         
    public int Sub() {
    	int num4=100;
        int num5=20;
        int num6=30;
        int sub=num4-num5-num6;
        return sub;
	}
	
	

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int res = calc.add();
		int res1 = calc.Sub();
		System.out.println(res);
		System.out.println(res1);
		
		
		
		
	
	
}
}