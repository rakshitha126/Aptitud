class NumberPattern{
	public static void main(String a[]){
		NumberPattern number=new NumberPattern();
		int i,j,k,num=5;
		number.printNumberPatternOne(num);
	    number.printNumberPatternTwo(num);
	    //number.printNumberPatternThree(num);//

	}
	
	public void printNumberPatternOne(int num){
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
		}
		System.out.println();
	}
	System.out.println();
}

    public void printNumberPatternTwo(int num){
		for(int i=1;i<=num;i++){
			int n=1;
			for(int j=i;j<=num;j++){
				System.out.print(n++ +"");
			}
			System.out.println();
		}
		System.out.println();
	}
	//*public void printNumberPatternThree(int num){//
		//for(int i=1;i<=num;i++){//
			//for(int j=1;j<=num;j++){//
				//if(i==j){//
					//System.out.print(i);//
				//}else{//
					//System.out.print("");//
				//}//
			//}//
			//System.out.println();//
		//}//
	//}//*

}










