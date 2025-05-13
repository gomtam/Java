package ch05.ex12_7;
import java.util.*;

public class Ex0512_7 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("id와 password를 입력해주세요: ");
			System.out.print("id: ");
			
			String id = s.nextLine().trim();
			
			System.out.print("password: ");
			
			String password = s.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("비밀번로가 일치하지 않습니다. 다시 입력해주세요.");
				}else {
					System.out.println("id와 password가 일치힙나다.");
					break;
				}
			}
		}//while
	}//main

}//class
