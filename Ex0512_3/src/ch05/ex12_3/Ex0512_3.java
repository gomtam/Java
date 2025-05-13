package ch05.ex12_3;


public class Ex0512_3 {

	public static void main(String[] args) {
//		throw new RuntimeException();
		try {
		method1();
		} catch (Exception e) {
			System.out.println("Exception 발생");
		}
	}
	static void method1() throws Exception{
		method2();
	}
	static void method2() throws Exception{
		throw new Exception();
	}
}
