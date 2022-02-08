package generic;

public class GenericMethodTest {
public <E>void displayArrayElements(E[] elements)
{
	for (E element: elements) {
		System.out.println("element is :"+element);
	}
}
	public static void main(String[] args) {
		GenericMethodTest obj=new GenericMethodTest();
		Integer [] intarray = {10,20,30,40,50,60,70};
		String[] str = { "java","awp","android","oops" };
		obj.displayArrayElements(intarray);
		obj.displayArrayElements(str);

	}

}
