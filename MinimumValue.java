package ArrayProgrames;
 public class MinimumValue {
   public static void main(String[] args) {
		int[] array = {10,20,30,40,50,60,70,80,90,100};
		int minimumValue =0;
		for(int a:array){
			if(minimumValue==0){
				minimumValue = a;
			}
			if(a<minimumValue){
				minimumValue = a;
			}
	   }
		System.out.println(minimumValue);
     }
}
