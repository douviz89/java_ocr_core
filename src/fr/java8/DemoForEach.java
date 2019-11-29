package fr.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer i) {
		System.out.println(i);
	}
	
}

public class DemoForEach {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(2, 3, 4, 5, 6, 7);

		// without Anonymous or lamda exressions
//		Consumer<Integer> c = new ConsImpl();
//		values.forEach(new Consumer<Integer>() {
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		});
		
		values.forEach(i -> System.out.println(i)); // lambda - Implementation of a Consumer interface
	}

}
