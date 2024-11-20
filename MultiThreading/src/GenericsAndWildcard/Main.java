package GenericsAndWildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	// Generic class
//		Print<Integer> print = new Print<>(23);
//		print.display();
//		
//		Print<Double> print1 = new Print<>(23.2);
//		print1.display();
//		
//		Print<String> print2 = new Print<>("Sasti");
//		print2.display();
		
		//Generic Methods
//		Display dis = new Display();
//		dis.displayMethod(new Bus(3,"TAT"));
		
// class Print<T extends Parentclass & interface1 & interface2>   --> multibound
		
		
		List<Vehicle> listVehicle = new ArrayList<>();
		
		List<Object> listBus = new ArrayList<>();
		
		PrintWildCard obj = new PrintWildCard();
		obj.printMethod(listBus);
		
	}

}
