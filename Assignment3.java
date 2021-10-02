package week1.day1;

public class Assignment3 {
	
	static int i =0; static int j =1 ; static int range = 9; 

	public static void main(String[] args) {
		
		System.out.println(i);
		
		for (range = 1;range <=9; range++) {
			
			
			
			int sum = i+j;
			
			i=j;
			j=sum;
						
			System.out.println(sum);
			
			
		}
	}

}
