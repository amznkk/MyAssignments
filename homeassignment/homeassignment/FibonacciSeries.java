package week1.day1.homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 5;
		int num1 =0;
		int num2 = 1;
		
		for (int i=0; i<=range; i++){
			int num3 = num1 + num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
			
		}
		

	}

}
