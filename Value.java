import java.util.Scanner;
class Value {
	
	public static void main(String[] args) {
		
		Value val = new Value();
		val.example();
	}
	
	public void example() {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int oddnumber[] = new int[size];
		int sum = 0;
		for(int i=0; i<size; i++) {
		
			oddnumber[i] = sc.nextInt();
		
			if(oddnumber[i] / 2+1 != 0) {
			sum = sum + oddnumber[i];	
			}		
		}
		System.out.println("Sum :" +sum);
	}

}