package ficha1;

import java.util.stream.Stream;

public class ex2 {
	public static void main(String[] args) {
		Stream<String> nomes = Stream.of("Jose", "Kiko", "Joao");
	
		nomes.findFirst().map(elem -> new String(elem.toUpperCase())).ifPresent(s -> System.out.println(s));
		nomes.map(String::toUpperCase).filter(elem -> elem.contains("K")).forEach(System.out::println);
		
		boolean a = nomes.map(String::toLowerCase).anyMatch(elem -> elem.startsWith("k"));
		
		if(a)
			System.out.println("Existe");
		else
			System.out.println("Não existe");
		
		
		/*Stream<String> nome = nomes.map(String::toLowerCase).filter(elem -> elem.startsWith("k"));
		if(nome != null)
			System.out.println("Existe");
		else
			System.out.println("Não existe");
		*/
	}
}
