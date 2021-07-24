import java.util.Scanner;

class Patterns{
	public static void main(String []a){
	Scanner se=new Scanner(System.in);
	byte row=se.nextByte();
	Patterns ps=new Patterns();
	ps.FirstPattern(row);
	System.out.println("----------------------------------------------");
	ps.SecondPattern(row);
	System.out.println("----------------------------------------------");
	ps.ThirdPattern(row);
	System.out.println("----------------------------------------------");
	ps.FourthPattern(row);
	System.out.println("----------------------------------------------");
	ps.FifthPattern(row);
	System.out.println("----------------------------------------------");
	ps.SixthPattern(row);
	System.out.println("----------------------------------------------");
	ps.SeventhPattern(row);
	System.out.println("----------------------------------------------");
	ps.EightPattern(row);
	System.out.println("----------------------------------------------");
	ps.NinePattern(row);
	System.out.println("----------------------------------------------");
	ps.TenPattern(row);
	System.out.println("----------------------------------------------");
	
	
	}
	void FirstPattern(byte row){
		
	for(int r = 1;r <= row;  r++){
	 for(int c = 1;c<= row;  c++) {
		
         if(c<=r && r+c<=6)
	
			System.out.print("*\t");
	     else
	         System.out.print(" \t ");
	 }
			
			System.out.println();
		}
	
	}
	void SecondPattern(byte row){
		
	for(int r = 1;r <= row;  r++){
	 for(int c = 1;c<= row;  c++) {
		
         if(r<=c && r+c<=6)
	
			System.out.print("*\t");
	     else
	         System.out.print("\t");
	 }
			
			System.out.println();
		}
	
	}
	
void ThirdPattern(byte row){
		
	for(int r = 1;r <= row;  r++){
	 for(int c = 1;c<= row;  c++) {
		
         if(c<=r||c==1||r+c>=(row+1))
	
			System.out.print("*\t");
	     else
	         System.out.print("\t");
	 }
			
			System.out.println();
		}
	
	}
	void FourthPattern(byte row){
		
	for(int r = 1;r <= row;  r++){
	 for(int c = 1;c<= row;  c++) {
		
         if(r==1||c<=r && r+c<=(row+3)||r==5||r+c<=(row+1))
	
			System.out.print("*\t");
	     else
	         System.out.print("\t");
	 }
			
			System.out.println();
		}
	
	}	
	
	void FifthPattern(byte row){
		
	for(int r = 1;r <= row;  r++){
	 for(int c = 1;c<= row;  c++) {
		if(c>=r && r+c>=6)
        
			System.out.print("*\t");
	     else
	         System.out.print("\t");
	 }
			
			System.out.println();
		}
	
	}	
	void SixthPattern(byte row){
		
	for(int r = 1;r <= row;  r++){
	 for(int c = 1;c<= row;  c++) {
		 if(r>=c && r+c>=6)
        
			System.out.print("*\t");
	     else
	         System.out.print("\t");
	 }
			
			System.out.println();
		}
	
	}	
	void SeventhPattern(byte row){
		
	for(int r = 1;r <= row;  r++){
	 for(int c = 1;c<= row;  c++) {
		  if(c>=r||c==5||r+c<=(row+1))
	
        
			System.out.print("*\t");
	     else
	         System.out.print("\t");
	 }
			
			System.out.println();
		}
	
	}	
	void EightPattern(byte row){
		
	for(int r = 1;r <= row;  r++){
	 for(int c = 1;c<= row;  c++) {
		 if(r==5||c>=r && r+c>=(row-3)||r==1||r+c>=(row+1))
        
			System.out.print("*\t");
	     else
	         System.out.print("\t");
	 }
			
			System.out.println();
		}
	
	}	
	
	void NinePattern(int row){
		int anything=1;
		for(int r=1;r<=row;r++){
			for(int c=1;c<=row;c++) {
				if(c<=r||r+c >= row+1) {
				
				   System.out.print(anything+ "\t");
				   anything++;
				}else
				   System.out.print("\t");
			        
				
			}
			System.out.println();
			
		}
	}
			
			void TenPattern(int row){
		int anything=1;
		for(int r=1;r<=row;r++){
			for(int c=1;c<=row;c++) {
				if(c<=r||r+c<=row+1){
				   System.out.print(anything+"\t");
				   anything++;
					
				}else {
					System.out.print("\t");
					anything++;
			}
			}
			System.out.println();
			
		}
	}
}