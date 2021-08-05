class FibonacciWithFor
{
public static void main(String a[])
{
printFibonacci(10,0,1);
}
static void printFibonacci(int limit,int a,int b)
{
int sum;
for(int i=0;i<limit;i++)
{
sum=a+b;
System.out.println(a+"\t");
a=b;
b=sum;
}
}
}
