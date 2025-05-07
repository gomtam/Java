package ch11.ex05;

public class Ex1105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.autoPlat(new B());
		a.autoPlat(new C());
	}

}

interface I{
	public abstract void play();
}

class B implements I{
	public void play() {	System.out.println("play in B class");	}
}

class C implements I{
	public void play() {	System.out.println("play in C class");	}
}

class A{
	void autoPlat(I i) {	i.play();	}
}