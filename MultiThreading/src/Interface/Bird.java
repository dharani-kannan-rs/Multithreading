package Interface;

public interface Bird {
	
	void canFly();
	
	
	default void canSee() {
		
		System.out.println("Bird can see, default method");
	}
	
	static void display() {
		System.out.println("Static method");
	}
	
	
}
