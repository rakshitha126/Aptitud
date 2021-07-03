class MatrixPattern
{
	public static void main(String a[])
	{
		StarPattern star=new StarPattern();
		System.out.println("StarPattern object is created");
		star.firstAndLast();
		
	}
                public void firstAndLast()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r==1 || r==5 || c==1 ||c==5)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}
}