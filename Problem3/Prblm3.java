package Problem3;
import java.util.Scanner;
public class Prblm3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		if(a%2==0)
		{
			a=a-1;
			
		}
		else 
		{
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

}
