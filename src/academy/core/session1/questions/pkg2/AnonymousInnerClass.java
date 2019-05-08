package academy.core.session1.questions.pkg2;

public class AnonymousInnerClass {
	// Is an anonymous class can be declared in a static method?
	
	static void staticMethod() {
		AnonymousInner aInner = new AnonymousInner() {  
			// methods here
		};
		
	}
}

class AnonymousInner {
	
}