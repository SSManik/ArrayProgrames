package ArrayProgrames;
public class ArrayCircleShift {
	public static void main(String[] args) {
      int[] value={1,2,3,4,5,6,7,8,9};
      int temp=0;
      temp=value[0];
      for(int i=0;i<value.length;i++){
    	  if(value.length==i+1){
    		  value[i]=temp;
    	  }
    	  else{
    		value[i]=value[i+1];  
    	  }
      }
        for(int a:value){
        	System.out.print(" "+ a);
        }
	}

}
