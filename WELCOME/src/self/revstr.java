package self;
import java.util.*;
public class revstr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
;	//	String s ="swapnil";
		String str="";
		int a =s.length();
		for(int i=a-1; i>=0 ; i--) {
		
		
	 str = str+ s.charAt(i);
		
		}
		System.out.println(str);
		}
	}


