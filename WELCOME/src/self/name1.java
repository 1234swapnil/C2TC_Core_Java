package self;
import java.util.*;

public class name1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("can u guess my name ?yes or no ");
		String name=sc.nextLine().toString();
		if ( name.equals("yes"))
		{
			System.out.println("ok");
			System.out.println("how many letters in my name? range is between(1-5)");
			int letter =sc.nextInt();
			if(letter==3) 
			{
				System.out.println("wohooooo your guessing is right,Then guess now ");
				System.out.println("s"+"--"+" i");
				System.out.println("can you suggest letter");
				String sap =sc.next();
				if(sap.equals("a")) {
					System.out.println("CONGRATULATIONS!!!!!");
					System.out.println("your guessing name is right 'sai'");
				}
				else {
					System.out.println("ur near to guessing");
				}
				
					
				}
			
		else
		{
				System.out.println("ooooooh sorry,your guessing was wrong ");
			}
			
	}
	else 
	{System.out.println("ok ");

	

}
}
}
