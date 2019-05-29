package academy.core.session2.interfaces.defaultmodifier;

/**
 * A default method cannot override a method from java.lang.Object 
 * 
 * @author r.paredes.bernal
 *
 */
public interface I {
	default boolean equals(Object o) {
		return true;
	}
}
