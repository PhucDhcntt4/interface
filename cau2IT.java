interface car{

	public void accelerate();
	public void Color();
	public void Speed();
}
 class BMW implements car {

	private String Color;
	private double Speed;

public BMW(String Color, double Speed){

	this.Color = Color;
	this.Speed = Speed;
}

@Override
	public void accelerate(){

		System.out.println("BMW accelerate!");

	}


	public String getColor(){
		return Color;
	}

	public void setColor(String Color){

		this.Color=Color;
	}


	
	public double getSpeed(){
		return Speed;	
	}

	public void setSpeed(double Speed){

		this.Speed = Speed;
	}

}
class Civic implements car{
	private String Color;
	private double Speed;

public Civic(String Color, double Speed){

	this.Color = Color;
	this.Speed = Speed;
}
@Override
public void accelerate(){
	System.out.println("Civic accelerate!");
}

public String getColor(){
		return Color;
		}


public void setColor(String Color){

		this.Color=Color;
	}


	
	public double getSpeed(){
		return Speed;	
	}
	public void setSpeed(double Speed){

		this.Speed = Speed;
	}


	
public void tostring(){

	System.out.println("Civic ---> accelerate!");
		
	}

}

public class cau2IT{
	public static void main(String[] args) {
		BMW b = new BMW();
		b.accelerate();


		Civic c = new Civic();
		C.accelerate();
		
	}
}