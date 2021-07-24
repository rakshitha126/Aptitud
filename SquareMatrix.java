class SquareMatrix
{
	public static void main(String a[])
	{
		SquareMatrix matrix=new SquareMatrix();
		System.out.println("Matrix object is created");
		matrix.Squarematrix();
		
	}
	
	public void Squarematrix()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r==1|| r==5|| c==1|| c==5){
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