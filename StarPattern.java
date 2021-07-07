class StarPattern{
	public static void main(String a[]){
	StarPattern pattern=new StarPattern();
	int i,j,rows=5;
	pattern.printStarPatternIncreasing(rows);
                pattern.printStarPatternDecreasing(rows);
	pattern.printStarPatternThree(rows);
                pattern.printStarPatternFour(rows);
	pattern.printStarPatternFive(rows);
	pattern.printStarPatternSix(rows);
	pattern.printStarPatternSeven(rows);
	pattern.printStarPatternEight(rows);
	pattern.printStarPatternNine(rows);
	pattern.printStarPatternTen(rows);
               
	}
public void printStarPatternIncreasing(int rows)
{
for(int i=0;i<rows;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print("* ");
}
System.out.println(" ");
}
}
public void printStarPatternDecreasing(int rows)
{
for(int i=0;i<rows;i++)
{
for(int j=2*(rows-i);j>=0;j--)
{
System.out.print(" ");
}
for(int j=0;j<=i;j++)
{
System.out.print("* ");
}
System.out.println(" ");
}
}
public void printStarPatternThree(int rows)
{
for (int i=1;i<=rows;i++)
{
for(int j=1;j<=i;j++){
if(i==3 && j==2 || i==4 && j==2 || i==4 && j==3){
System.out.print(" ");
}
else
{
System.out.print("*");
}
}
System.out.println();
}
System.out.println();
}
public void printStarPatternFour(int rows){
for (int i=1;i<=rows;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" ");
}
for(int j=i;j<=rows;j++)
{
if(i==2 && j==3 || i==2 && j==4 || i==3 && j==4)
{
System.out.print(" ");
}
else
{
System.out.print("*");
}
}
System.out.println();
}
System.out.println();
}
public void printStarPatternFive(int rows){
for (int i=1;i<=rows;i++)
{
for(int j=i;j<=rows;j++)
{
System.out.print("*");
}
System.out.println();
}
System.out.println();
}
public void printStarPatternSix(int rows){
for (int i=1;i<=rows;i++)
{
for(int j=i;j<=rows;j++)
{
if(i==2 && j==4 || i==2 && j==3 || i==3 && j==4)
{
System.out.print(" ");
}
else
{
System.out.print("*");
}
}
System.out.println();
}
System.out.println();
}
public void printStarPatternSeven(int rows)
{
for(int i=1;i<=rows;i++)
{
for(int j=i;j<=rows;j++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print("*");			
}
System.out.println();		
}
System.out.println();
}
public void printStarPatternEight(int rows)
{
for(int i=1;i<=rows;i++)
{
for(int j=i;j<=rows;j++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
if(i==3 && j==2 || i==4 && j==2 || i==4 && j==3)
{
System.out.print(" ");
}
else
{
System.out.print("*");
}
}
System.out.println();
}
System.out.println();
}
public void printStarPatternNine(int rows){
for(int i=1;i<=rows;i++)
{
for(int j=1;j<=rows;j++)
{
if(i==j || i==1 && j==5 || i==2 && j==4 || i==4 && j==2 || i==5 && j==1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();
}
public void printStarPatternTen(int rows){
for(int i=1;i<rows;i++)
{
for(int j=(i-1);j<rows;j++)
{
System.out.print(" ");
}
for(int j=1;j<i-1;j++)
{
System.out.print("*");
}
for(int j=1;j<i;j++)
{
System.out.print("*");
}
System.out.println();
}
System.out.println();
}
}
