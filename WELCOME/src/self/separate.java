package self;

import java.util.Arrays;


public class separate {

	public static void main(String[] args) {
		int a =0;
		int b=0; int c=0;
		String s ="12a45g578b";
		String[] r=s.split("[a-z]");
		
		for(String str:r) {
			System.out.println(str);
		if(a==0)	
		 
		{
			 a = Integer.parseInt(str);
		 }
		else
		{
			if (b==0)
			{
			 b = Integer.parseInt(str);
			}
			else
			{
				c = Integer.parseInt(str);
			}
		}
		int d=Math.max(a, b);
		System.out.println(Math.max(c, d));
		}
		System.out.println(Math.max(c, d));
	}
	

}
