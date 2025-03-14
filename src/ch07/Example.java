package ch07;

public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.mehtod2();
		}
		
//		if(a instanceof C) {
//			C c2 = (C) a;
//			c2.mehtod2();
//		}
	}
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
		
	}
}
