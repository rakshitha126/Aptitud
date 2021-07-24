import java.util.Scanner;

class PyramidPattern{
	public static void main(String []a){
	Scanner se=new Scanner(System.in);
	byte row=se.nextByte();
	PyramidPattern ps=new PyramidPattern();
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
		
		int r=1,c=1;
		 while(r<=row  ){
		 
	       
		   
		   
		 while(c<=row  ){
			
         if(c<=r && r+c<=6){
	
			System.out.print("*\t");
			
		 }
	     else{
	         System.out.print(" \t ");
		     
			
			
		      
		 }	
		 c++;
		 
		 }	
         r++;
         c=1;		 
			System.out.println();
		
		 }
	}
	void SecondPattern(byte row){
		
	   int r=1,c=1;
	   while(r<=row){
		   
	   while(c<=row) {
		
		 if(r<=c && r+c<=6) {
	
			System.out.print("*\t");
		 }
	     else{
	         System.out.print("\t");
	 }
	 c++;
	   }
	   r++;
		c=1;	
			System.out.println();
		}
	
	}
	
void ThirdPattern(byte row){
	
	
	   int r=1,c=1;
	   while(r<=row){
		   
	   while(c<=row) {
		
         if(c<=r||c==1||r+c>=(row+1)){
	
			System.out.print("*\t");
		 }
	     else{
	         System.out.print("\t");
	 }
	 c++;
	   }
	   r++;
		c=1;	
			System.out.println();
		}
	
	}
	void FourthPattern(byte row){
		
	
	   int r=1,c=1;
	   while(r<=row){
		  
	   while(c<=row) {
		
         if(r==1||c<=r && r+c<=(row+3)||r==5||r+c<=(row+1)){
	
			System.out.print("*\t");
		 }
	     else{
	         System.out.print("\t");
	 }
	 c++;
	   }
	   r++;
		c=1;	
			System.out.println();
		}
	
	}	
	
	void FifthPattern(byte row){
		
	
	   int r=1,c=1;
	   while(r<=row){
		   
	   while(c<=row) {
		   
		if(c>=r && r+c>=6){
        
			System.out.print("*\t");
		}
	     else{
	         System.out.print("\t");
	 }
	 c++;
	   }
	   r++;
		c=1;	
			System.out.println();
		}
	
	}	
	void SixthPattern(byte row){
		
	   int r=1,c=1;
	   while(r<=row){
		   
	   while(c<=row) {
		 if(r>=c && r+c>=6){
        
			System.out.print("*\t");
		 }
	     else{
	         System.out.print("\t");
	 }
	 c++;
	   }
	   r++;
		c=1;	
			System.out.println();
		}
	
	}	
	void SeventhPattern(byte row){
		
	
	   int r=1,c=1;
	   while(r<=row){
		   
	   while(c<=row) {
		   
		  if(c>=r||c==5||r+c<=(row+1)){
	
             System.out.print("*\t");
		  }
	     else{
	         System.out.print("\t");
	 }
	 c++;
	   }
	   r++;
		c=1;	
			System.out.println();
		}
	
	}	
	void EightPattern(byte row){
		
	
	   int r=1,c=1;
	   while(r<=row){
		  
	   while(c<=row) {
		   
		 if(r==5||c>=r && r+c>=(row-3)||r==1||r+c>=(row+1)){
        
			System.out.print("*\t");
	   }
	     else{
	         System.out.print("\t");
	 }
	 c++;
	   }
	   r++;
		c=1;	
			System.out.println();
		}
	
	}	
	
	void NinePattern(byte row){
		int anything=1;
		
	   int r=1,c=1;
	   while(r<=row){
		   
	   while(c<=row) {
				if(c<=r||r+c >= row+1) {
				
				   System.out.print(anything+ "\t");
				   anything++;
				}else{
				   System.out.print("\t");
				}
				c++;
	            }
	            r++;
			     c=1;   
				
			
			System.out.println();
			
		}
	}
			
			void TenPattern(byte row){
		int anything=1;
		
	   int r=1,c=1;
	   while(r<=row){
		   
	   while(c<=row) {
		   
				if(c<=r||r+c<=row+1){
				   System.out.print(anything+"\t");
				   anything++;
					
				}else {
					System.out.print("\t");
					anything++;
			}
			c++;
			}
			r++;
			c=1;
			System.out.println();
			
		}
	}
}