class FibonacciWithWhile
{
public static void main(String a[])
{
printFibonacci(10,0,1);
}
static void printFibonacci(int limit,int a,int b)
{
while(limit>a)
{
	int sum;
sum=a+b;
System.out.println(a+"\t");
a=b;
b=sum;
}
}
}