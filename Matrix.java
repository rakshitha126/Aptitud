class Matrix
{
	public static void main(String a[])
	{
		Matrix matrix=new Matrix();
		System.out.println("Matrix object is created");
		matrix.printmatrix();
		
	}
	
	public void printmatrix()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				
				System.out.print(r +""+ c +"\t");
			}
		
			
		
	System.out.println();
}
}
}