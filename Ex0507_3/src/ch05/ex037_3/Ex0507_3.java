package ch05.ex037_3;

public class Ex0507_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		for (int i=0; i<group.length; i++) {
			group[i].move(100, 200);
		}
		
		
	}

}


abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit{
	int x, y;
	void move(int x, int y) {	System.out.println("Marine[x="+x+", y="+y+"]");		}
	void stimPack() 		{	System.out.println("Marine use STIMPACK");			}
}

class Tank extends Unit{
	int x, y;
	void move(int x, int y) {	System.out.println("Tank[x="+x+", y="+y+"]");		}
	void changeMode() 		{	System.out.println("Tank change mode");				}
}

class Dropship extends Unit{
	int x, y;
	void move(int x, int y) {	System.out.println("Dropship[x="+x+", y="+y+"]");	}
	void load() 			{	System.out.println("Dropship load unit");			}
	void unload() 			{	System.out.println("Dropship unload unit");			}
}