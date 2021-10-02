package week1.day1;

public class Assignment2 {
	
	static int i = 10;
	static int j;
	static int fact = 1;
	
	public static void main(String[] args) {
		
		for (j=1; j<=i;j++) {
			fact= j*fact;
		}
	System.out.println("Factorial value of i is"+ fact);
	
	}
	
	

}
