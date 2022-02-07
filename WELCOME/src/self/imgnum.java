
package self;
import java.util.*;

public class imgnum {

	public static void main(String[] args) {
		System.out.println("can you guess my number(1-100)");
		Scanner sc =new Scanner(System.in);
	for(	int mynum=sc.nextInt(); mynum<100 ; ) 
		{if (mynum==25) {
			
			System.out.println("wohooooo, your guessing is right");
			break;
			}
		 else { 
			 if(mynum<25) {
				 if (mynum>20) {
				 System.out.println("your guessing number is small but it near to my number"); 
				 
				 int mynum1=sc.nextInt();
					mynum=mynum1;
					}
				 else{
					 System.out.println("your guessing number is small"); 
					 
					 int mynum1=sc.nextInt();
						mynum=mynum1;
				 }
			 }else {
				 if(mynum<30) {
			System.out.println("your guessing num is large but it is near to my number");
			int mynum1=sc.nextInt();
			mynum=mynum1;
				 }
				 else {
 System.out.println("your guessing number is large"); 
					 
					 int mynum1=sc.nextInt();
						mynum=mynum1;				 }
			 }
		}
	//int mynum1=sc.nextInt();
	//mynum=mynum1;
		
		
	}
	}


}
