class MidRowMatrix
{
	public static void main(String a[])
	{
		MidRowMatrix matrix=new MidRowMatrix();
		System.out.println("Matrix object is created");
		matrix.Midmatrix();
		
	}
	
	public void Midmatrix()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if( r==3||  c==3){
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