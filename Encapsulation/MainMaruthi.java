package Encapsulation;

public class MainMaruthi {

	public static void main(String[] args) {
		MarutiSuzuki ms=new MarutiSuzuki (20);
		
		ms.Displaystatus();
		ms.startEngine();
		ms.drive(100);
		ms.Displaystatus();
		ms.stopEngine();
//		refuel with again 20liters
		ms.refuel(20);
		ms.Displaystatus();
	}

}
