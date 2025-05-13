package ch05.ex12_1;

public class Ex0512_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(1);//아무 문제 없는 코드, 예외 발생하지 않을 코드
		try {
			System.out.println(2);
			System.out.println(2/0);//예외가 발생하는 코드
			System.out.println(3);
		} catch (ArithmeticException ae) {//더 구체적인 예외 상황을 가정
			System.out.println("ArithmeticException");//예외 발생시 코드
			System.out.println(ae);
		} catch (Exception e) {//Exception = 모든 예외상황을 다 잡음, 모든 예외상황들의 조상
			System.out.println("Exception");
		}
		System.out.println(5);

		
		
	}

}
