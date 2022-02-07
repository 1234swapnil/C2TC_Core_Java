package self;
import java.util.*;
import java.util.Scanner;

public class mixed
{
	
		public static void mymethod(int a) {
		 int   b=0,c,d;
			d=a;
				while(a!=0)
					{
			c=a%10;
		b=b*10+c;
		a/=10;
				}
		if(d==b)
		{
			System.out.println("its palindrome");
			 
		}
		else
		{
			System.out.println("its not palindrome");
			
		} 
		}
		public static void oddeven(int a) {
			if(a%2==0) {
				System.out.println("its even number");
			}
			else {
				System.out.println("its oddd number");
			}
		}
		public static void square(int a) {
			int sq=a*a;
			String s= "square of"+a; 
			String s1=" is "+sq;
			String s2=s.concat(s1);
			System.out.println(s2);
		}
			
		public static void main(String[] args) {
		//	mymethod();
			System.out.println("enter a number");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			//a=p;
			mymethod( a);
			oddeven(a);
			square(a);
		}
		public static void squareroot() {
			
		}
		}


