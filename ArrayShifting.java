package ArrayProgrames;
public class ArrayShifting {
   public static void main(String[] args) {
		int[] value={1,2,3,4,5,6,7,8,9};
		for(int i=0;i<value.length-1;i++){
          value[i]=value[i+1];
          System.out.print(value[i]);
		}
     }
 }
