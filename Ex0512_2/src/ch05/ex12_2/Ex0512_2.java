package ch05.ex12_2;

public class Ex0512_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Exception e = new Exception("사용자정의 Exception 메시지");
			throw e;
		} catch (Exception e) {
		// TODO: handle exception
			System.out.println("에러메시지: "+e.getMessage());
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("프로그램 종료");
	}
}
