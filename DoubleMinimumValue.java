package ArrayProgrames;
 public class DoubleMinimumValue {
	public static void main(String[] args) {
		int[] numbers={10,20,30,40,50,60,70,80,90,100};
		int min1 =0;
		int min2 =0;
		for(int a:numbers){
			if(min1==0 && min2==0){
				min1=a;
				min2=a;
		}
		     if(a<min2){
		       min2=a;
	         if(a>min1){
	        	min2=min1;
                min2=a;
            	}
		    }
	    }
	 System.out.println("Minimum value 1 is" + min1);
	 System.out.println("Minimin value 2 is" + min2);
	}
 }
