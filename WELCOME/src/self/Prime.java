package self;
import java.util.*;
class number {
	
}
public class Prime {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
	
		System.out.println("enter a number ");
		int num =sc.nextInt();
		int i=0;
		int flag=1;
	
	for (i=2; i<=num/2; ++i) 
		
			{
			if(num%i==0)
			  { 
				
				flag=0;
				break;
			  }
		    }
		if(flag==1) {
			if(num==1) {
				System.out.println("it iss not prime number and not composite");
				
			}else
			{
			System.out.println("prime");
			
		    }
		}
		else {
			System.out.println("not");
			
		}


	
	
}
}
		
			

	
				
			
	


