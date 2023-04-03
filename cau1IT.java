interface Shape{

	void draw();

}

class Rectangle implements Shape{
@Override
	public void draw(){
		System.out.println("ve hinh chu nhat!");
	}
}

class Circle implements Shape{
@Override
	public void draw(){
		
		System.out.println("ve hinh tron!");
	}
}

public class cau1IT{
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.draw();

		Circle c = new Circle();
		c.draw();
	}
}