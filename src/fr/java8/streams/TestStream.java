package fr.java8.streams;

//Et une classe de test : 
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {
		List<Personne> listP = Arrays.asList(
				new Personne(1.80, 70.0, "A", "Nicolas", Couleur.BLEU),
				new Personne(1.56, 50.0, "B", "Nicole", Couleur.VERRON),
				new Personne(1.75, 65.0, "C", "Germain", Couleur.VERT),
				new Personne(1.68, 50.0, "D", "Michel", Couleur.ROUGE),
				new Personne(1.96, 65.0, "E", "Cyrille", Couleur.BLEU),
				new Personne(2.10, 120.0, "F", "Denis", Couleur.ROUGE),
				new Personne(1.90, 90.0, "G", "Olivier", Couleur.VERRON));

		Stream<Personne> sp = listP.stream();
		sp.forEach(System.out::println);

		System.out.println("\nAprès le filtre et le map et reduce");
		sp = listP.stream();

		sp = listP.stream();

		Optional<Double> sum = sp	.filter(x -> x.getPoids() > 50)
									.map(x -> x.getPoids())
									.reduce((x,y) -> x+y);
		//Permet de gérer le cas d'erreur en renvoyant 0.0 si isPresent() == false
		System.out.println(sum.orElse(0.0));
		
		sp = listP.stream();

		List<Double> ld = sp.filter(x -> x.getPoids() > 50)
							.map(x -> x.getPoids())
							.peek(System.out::println)
							.collect(Collectors.toList());
		System.out.println(ld);
		
		
	}
}
