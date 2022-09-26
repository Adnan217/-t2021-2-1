package Problem2;
import java.util.Scanner;
public class AtoX{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		
      for(int i=1;i<=a;i++){
    	  int count=0;
    	  for(int j=1;j<=100;j++){
    		  if(count !=a){
    			  if(j%2 !=0){
    				  System.out.println(j);
    				  count++;
    			  }
    		  }
    		  else{
    			  break;
    		  }
    	  }
    	  break;
      }
	}
}	


