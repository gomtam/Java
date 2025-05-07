package ch11.ex01;

public class Ex1101 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		car = fe;
		fe2 = (FireEngine)car;
		fe2.water();
		
//		fe2 = (FireEngine)car;
//		fe2.drive();
	}

}


class Car{
	String color;
	int door;
	void drive() {
		System.out.println("drive. ....");
	}
	void stop() {
		System.out.println("stop, ....");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water, ....");
	}
}
