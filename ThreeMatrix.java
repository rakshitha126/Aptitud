class ThreeMatrix
{
	public static void main(String a[])
	{
		ThreeMatrix three=new ThreeMatrix();
		System.out.println("Matrix object is created");
		three.Threematrix();
		
	}
	
	public void Threematrix()
	{
		for(int r=3;r<=5;r++)
		{
			for(int c=3;c<=5;c++)
			{
				if( r==3||  c==3||c==4||c==5 && r==4||c==4 &&r==5||c==5 ){
				System.out.print(r +""+ c + "\t");
			}
			else{
			System.out.print(" \t");
		}
		
	}
	System.out.println();
}
	}
}