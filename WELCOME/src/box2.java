

class box
{
	float width;
	float height;
	float depth;
	float volume()
	{
		return height*width*depth;
	}
}

	public class box2
	{

	public static void main(String[] args)
	{
		box red=new box();
		red.width=2.3f;
		red.height=4.5f;
		red.depth=3.3f;
		float vol=red.volume();
		System.out.println("volume of red box is  "+vol);

	}
	}
	

