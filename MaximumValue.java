package ArrayProgrames;
public class MaximumValue {
   public static void main(String[] args) {
		int[] number={10,20,30,40,50,60,70,80,90,100};
        int maximumValue = 0;
        for(int a:number){
        	if(a>maximumValue){
        		maximumValue=a;
        	}
        }
        System.out.println(maximumValue);
	}

}
