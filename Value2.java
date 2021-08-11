import java.util.Scanner;

public class Value2 {
	
	public static void main(String[] args) {
		
		Value2 val = new Value2();
		val.example();		
	}
	
	public void example() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int sum = 0;
		int n=6;
		for(int i=0; i<n; i++) {
			if(i % 2 ==0) {
				sum = number + i;
			}
		}
		System.out.println("Sum :" +sum);
	}

}