package fr.java8;

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
		A obj; 
		
		// Classic use of interface in the class Xyz
//		obj = new Xyz();
		
		// Anonymous Inner Class
//		obj = new A() {
//			public void show(String s) {
//				System.out.println("Hi" + s);
//			}
//		};
		
		// lambda exression
		obj = s -> System.out.println("Hi " + s);

		obj.show("Douviz");
	}

}
