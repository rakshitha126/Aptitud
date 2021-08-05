class PrimeNumbers
{
public static void main(String a[])
{
printPrimeNumbers(9);
}
static void printPrimeNumbers(int num)
{
	boolean isPrime=false;
	for(int i=1;i<=num/2;i++)
	{
		if(num%i==0)
		{
			isPrime=true;
		}
	}
	if(isPrime==true)
	{
		System.out.println(num+"Not a prime number");
		
	}
	else if(isPrime==false)
		{
			System.out.println(num+"Prime number");
		}
}
}
