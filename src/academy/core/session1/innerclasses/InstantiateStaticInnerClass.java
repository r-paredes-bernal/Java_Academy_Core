package academy.core.session1.innerclasses;

public class InstantiateStaticInnerClass {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
	}
}
	
	class Outer {
		static class Inner {
			
		}
	}

