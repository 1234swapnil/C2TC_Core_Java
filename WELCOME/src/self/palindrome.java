package self;
import java.util.*;
public class palindrome {
	//Scanner sc= new Scanner(System.in);
static int a;
static int p;
	public static void mymethod() {
	 int   b=0,c,d;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a number");
		int a=sc.nextInt();
	
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
		System.out.println("its not");
		
	} 
	}
	
	
		
	public static void main(String[] args) {
	//	mymethod();
		//Scanner sc= new Scanner(System.in);
		//int p=sc.nextInt();
		//a=p;
		mymethod();
	}
	
	}
