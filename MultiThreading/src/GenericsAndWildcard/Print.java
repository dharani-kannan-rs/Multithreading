package GenericsAndWildcard;

public class Print<T extends Number> { //upperbound
	
	T value;
	
	public Print(T value) {
		this.value = value;
	}
	public void display() {
		System.out.println(value);
	}
}
