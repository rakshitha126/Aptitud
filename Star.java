class Star
{
	public static void main(String a[])
	{
		Star star=new Star();
		System.out.println("StarPattern object is created");
                                star.uptoThreeRowColumn();
		
	}
                public void uptoThreeRowColumn()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if((r==3 && c==3)||(r==3 && c==1)||(r==3 && c==2)||(r==2 && c==3)||(r==1 && c==3))

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