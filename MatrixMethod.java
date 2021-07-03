class MatrixMethod
{
	public static void main(String a[])
	{
		StarPattern star=new StarPattern();
		System.out.println("StarPattern object is created");
		star.rowsColumns();
		
	}

	public void rowsColumns()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}
}