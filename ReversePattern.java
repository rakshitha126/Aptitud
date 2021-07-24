public class ReversePattern  
{  
public static void main(String args[])  
{ 
int row=5 ;
for (int r=1;r<=row;r++){
			for(int c=1;c<=r;c++){
				if(r==3 && c==2 || r==4 && c==2 || r==4 && c==3){
					System.out.print(" ");
					}else{
						System.out.print("*");
					}
			}
			System.out.println();
		}
		
	System.out.println();
	}
}