package ArrayProgrames;

public class DoubleMaximumValue {
 public static void main(String[] args) {
	 int[] array ={10,20,30,40,50,60,70,80,90,100};
	 int max1 =0;
	 int max2 =0;
	 for(int a:array){
		 if(a>max2){
		 max2=a;
		 }
		 if(a>max1){
			 max2=max1;
			 max1=a;
		 }
	 }
	 System.out.println("this is max1 :" +max1);
	 System.out.println("this is max2 :" +max2);
   }
 }
