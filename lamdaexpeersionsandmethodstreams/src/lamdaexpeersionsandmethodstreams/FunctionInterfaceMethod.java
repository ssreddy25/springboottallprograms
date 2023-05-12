package lamdaexpeersionsandmethodstreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfaceMethod {

	public static int increment(int number) {
		return ++number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(increment(3));

		Function<Integer, Integer> numberIncrement = number -> number + 1;

		int output = numberIncrement.apply(5);
		System.out.println(output);

		Predicate<String> priedicate = String::isEmpty;

		System.out.println(priedicate.test("java"));

		Predicate<Integer> priedicate1 = s -> s % 2 == 0;

		System.out.println(priedicate1.test(5));

		// T dentotes type the value
		// it does not take any areguments
		// it returns the output
		Supplier<Double> supplier = () -> Math.random();

		System.out.println(supplier.get());

		// T means it data type of the value
		// it accespt only one argument
		// it deos not return the output
		// Consumer<T> consumer =

		Consumer<Integer> consumer = s -> System.out.println(s);

		consumer.accept(7);

		Consumer<List<Integer>> consumer1 = s -> s.stream().forEach(d -> System.out.println(d));

		List<Integer> list = Arrays.asList(3, 5, 4, 7, 8, 9);

		consumer1.accept(list);

		// Predicate
		// 10 ->10%2==0;
		Predicate<Integer> pridicate = s -> s % 2 == 0;

		System.out.println(pridicate.test(9));

		Predicate<String> pridicate1 = String::isEmpty;

		System.out.println(pridicate1.test("java"));
		
		
		

	}

}
