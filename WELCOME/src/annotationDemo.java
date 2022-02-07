import java.lang.annotation.*;
@smartTV (brand="samsung",screensize=92)
class panasonic_series
{
	String modelno;
	int price;
	public panasonic_series(String modelno, int price) {
		
		this.modelno = modelno;
		this.price = price;
	}
	
}

public @interface annotationDemo {
	

}
