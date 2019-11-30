package fr.java8;

import java.util.function.Predicate;
import java.util.function.Supplier;

// Functionnal interface : it has only 1 abstract method
interface A {
	void show(String s);
}

//class Xyz implements A {
//	public void show() {
//		System.out.println("Hello");
//	}
//}

public class LambdaDemo {

	public static void main(String[] args) {
		//A obj;

		// Classic use of interface in the class Xyz
//		obj = new Xyz();

		// Anonymous Inner Class
//		obj = new A() {
//			public void show(String s) {
//				System.out.println("Hi" + s);
//			}
//		};

		// lambda exression
		A obj = s -> System.out.println("Hi " + s);

		obj.show("Douviz");

		// interface obj = (parametres...) -> definition de la methode abstraite de
		// l'interface
		// exp:
		Predicate<Integer> predicate = (i) -> i > 5;

		for (int j = 0; j < 10; j++) {
			if (predicate.test(j))
				System.out.println(j + " > 5");
		}

		Supplier<String> sayHello = () -> "hello";
		System.out.println(sayHello.get());

	}

}
