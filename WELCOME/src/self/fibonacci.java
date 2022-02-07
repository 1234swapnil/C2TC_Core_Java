package self;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
	int a, b, c,n;
	String av="radhe radhe its over";

	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter length of series");
	n=sc.nextInt();
	System.out.println("first number of series");
	a=sc.nextInt();
	System.out.println("second number of series");
	b=sc.nextInt();
	c=a+b;
	System.out.println("this is your series".toUpperCase());
	for (int i=0; i<=n; ++i)
	
		//System.out.println("this is ypur series")
		{
		System.out.println(a);
	a=b;
	b=c;
	c=a+b;
	
	}
System.out.println(av);
	}

}
