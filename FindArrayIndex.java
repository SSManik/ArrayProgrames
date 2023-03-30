package ArrayProgrames;

public class FindArrayIndex {
	public static void main(String[] args) {
	int[] number ={10,20,30,40,50,60,70,80,90,100};
	int givenNumber=100 ;
	int index =0;
    for(int a:number){
    	if (a==givenNumber){
    		System.out.println("array index of : " + index);
    	}
	index++;
     }
	}
 }

