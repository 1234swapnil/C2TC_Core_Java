package generic;
class GenericTest<T>
{
	T obj;
	void add(T obj) 
	    {
		this.obj=obj;
		}
	T get() {
		return obj;
	}
}


public class GenericclassDemo {

	public static void main(String[] args) {
		GenericTest<Integer> obj=new GenericTest<Integer>();
		obj.add(10);
		System.out.println(obj.get());
		GenericTest<String> obj1=new GenericTest<String>();
		obj1.add("swapnil");
		System.out.println(obj1.get());
	}

}
