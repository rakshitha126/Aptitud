class Matrix{
public static void main(String args[])
{
Matrix matrix=new Matrix();
matrix.printMatrix();
System.out.println("Matrix object is created");
}
void printMatrix()
{
for(int r=1;r<=5;r++)
{
for(int c=1;c<=5;c++)
{
if(r==1)
{
System.out.print(r+ " "+c +"\t");
}
else
{
System.out.println("\t");
}
}
}
}
}