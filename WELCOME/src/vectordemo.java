import java.util.*;
import java.util.vector;
class Student2{
	int id;
	String name;
	int grade;
	public Student2(int id, String name, int grade) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public String toString() {
		String str="Student is ["+id+","+name+","+grade+"]";
		return str;
	}
	
}
public class vectordemo {

	public static void main(String[] args) {
	Vector v=new Vector();
	Student2 s1 =new Student2(101,"harry",10);
	
	Student2 s2 =new Student2(102,"hari",9);
	v.addElement(s1);
	v.addElement(s2);
	v.addElement(103);
	
Enumeration e =v.elements();
while (e.hasMoreElements())
{
	Object o=e.nextElement();
	System.out.println(o);
	
	
}
	}

}
