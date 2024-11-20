package GenericsAndWildcard;

public class Bus extends Vehicle{
	
	
	Integer number;
	String name;
	
	public Bus(Integer number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bus [number=" + number + ", name=" + name + "]";
	}
	
	

}
