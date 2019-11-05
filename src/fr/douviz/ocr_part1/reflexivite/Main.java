package fr.douviz.ocr_part1.reflexivite;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		// On récupère un objet Class
		Class c = new String().getClass();
		// Class c = String.class; est équivalent

		// La méthode getInterfaces retourne un tableau de Class
		Class[] faces = c.getInterfaces();
		Method[] methods = c.getMethods();
		Field[] m = c.getDeclaredFields();

		// Pour voir le nombre d'interfaces
		System.out.println("Il y a " + faces.length + " interfaces implémentées");
		// On parcourt le tableau d'interfaces
		for (int i = 0; i < faces.length; i++)
			System.out.println(faces[i]);
		System.out.println("--------------------------------");

		System.out.println("Il y a " + methods.length + " méthodes implémentées");
		// On parcourt le tableau de methodes
//		for (int i = 0; i < methods.length; i++)
//			System.out.println(methods[i]);
		System.out.println("--------------------------------");

		System.out.println("Il y a " + m.length + " champs dans cette classe");
		// On parcourt le tableau de champs
		for (int i = 0; i < m.length; i++)
			System.out.println(m[i].getName());
		System.out.println("--------------------------------");
		Constructor[] construc = c.getConstructors();
		System.out.println("Il y a " + construc.length + " constructeurs dans cette classe");
		// On parcourt le tableau des constructeurs
		for (int i = 0; i < construc.length; i++) {
			System.out.println(construc[i].getName());

			Class[] param = construc[i].getParameterTypes();
			for (int j = 0; j < param.length; j++)
				System.out.println(param[j]);

			System.out.println("-----------------------------\n");
		}
	}
}
