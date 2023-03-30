package ArrayProgrames;
public class DuplicatValue {
   public static void main(String[] args) {
	   int[] arr={1,2,3,4,5,6,7,8,9};
	   int count=0;
	   for(int number:arr){
           if(number==3){
             count++;        	   
           }		   
	   }
		if(count==0){
			System.out.println("Array value not a duplicate");
		}
		else{
			System.out.println("duplicate no 3 is : " + count + " times");	
		}
	System.out.println(count);
       	}
}
