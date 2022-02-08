package generic;
import java.util.ArrayList;
	import java.util.Iterator;

public class genericex1 {

	public static void main(String[] args) {
		
ArrayList<String> list =new ArrayList<String>();
list.add("india");
list.add("pakistan");
list.add("chin");
String country =list.get(0);
System.out.println("element is "+country);
	
Iterator <String> itr = list.iterator();
while(itr.hasNext())
	System.out.println(itr.next());
	}

}
