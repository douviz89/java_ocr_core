package fr.java8;


interface Phone {
	void call();
	default void message() {
		System.out.println("Sending message...");
	}
}

class AndroidPhone implements Phone {

	@Override
	public void call() {
		System.out.println("calling...");
	}
	
}

public class DemoInterface {

	public static void main(String[] args) {
		Phone p = new AndroidPhone();
		p.call();
		p.message();
	}

}
