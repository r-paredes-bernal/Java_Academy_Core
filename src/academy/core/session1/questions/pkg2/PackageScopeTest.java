package academy.core.session1.questions.pkg2;
import academy.core.session1.questions.pkg1.*;

public class PackageScopeTest extends ScopeTest{

	
	public static void main(String args[]) {
		//which attributes from pk1 are visible here
		ScopeTest scopeTest = new ScopeTest();
		scopeTest.train = 1;
		
		PackageScopeTest packageScopeTest = new PackageScopeTest();
		packageScopeTest.airplane = 2;
	}
}
