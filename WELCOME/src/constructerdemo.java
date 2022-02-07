
class student {
	int id;
	String name;
	String course;
	String gmail;

	student() {
	}

	public student(int id, String name, String course, String gmail) {

		this.id = id;
		this.name = name;
		this.course = course;
		this.gmail = gmail;

	}

	public void display() {
		System.out.println("student information:");
		System.out.println(id + "" + name + "" + course + "" + gmail);
	}
}

class constructerdemo {

	public static void main(String[] args) {
student s1 =new student(42,"swapnil","bsc IT","swapnilpatil10122@gmail.com");
//s1.id=1;
//s1.gmail="rag";
		s1.display();

	}

//@Override
	//public String toString() {
		//return "constructerdemo ["+course+"]";
	//}

}
