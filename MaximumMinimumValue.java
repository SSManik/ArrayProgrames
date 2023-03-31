package ArrayProgrames;
  public class MaximumMinimumValue {
     public static void main(String[] args) {
		int[] number = {23,43,44,55,66,67,11,89,98,91,111};
		int maximum = 0;
		int minimum = 0;
		for(int a:number){
			if(minimum==0){
				minimum = a;
			   }
			if(a<minimum){
				minimum = a;
			   }
			if(a>maximum){
				maximum= a;
			 }
		}
		System.out.println("Minimum number is : "+minimum);
		System.out.println("Maximum number is : "+maximum);
	}
}
