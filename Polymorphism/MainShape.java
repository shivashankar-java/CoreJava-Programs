package Polymorphism;

public class MainShape {

	public static void main(String[] args) {
		Shape s =new Shape();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		s.Draw();
		r.Draw();
        c.Draw();
	}

}
