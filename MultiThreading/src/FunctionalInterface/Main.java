package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		Consumer<Integer> a = (Integer val) -> {System.out.println(val);};
		
		a.accept(5);
		
		Supplier<Integer> s = () -> {return 45;};
		
		Integer num = s.get();
		
		System.out.println(num);
		
		
		Function<Integer,String> fun = (Integer val)-> {return "Good";};
		
		System.out.println(fun.apply(num));
		
		
		Predicate<Integer> pred = (Integer val) ->{return true;};
		System.out.println(pred.test(num));
		

	}

}
