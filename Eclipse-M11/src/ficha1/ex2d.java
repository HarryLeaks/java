package ficha1;

import java.util.stream.Stream;

public class ex2d {
	public static void main(String[] args) {
		String[] nomes = {"Jose", "Kiko", "Joao"};
		
		a(Stream.of(nomes));
		b(Stream.of(nomes));
		c(Stream.of(nomes));
	}	
	
	private static void a(Stream<String> nomes) {		
		nomes.findFirst().map(elem -> new String(elem.toUpperCase())).ifPresent(s -> System.out.println(s));
	}
	
	private static void b(Stream<String> nomes) {		
		nomes.map(String::toUpperCase).filter(elem -> elem.contains("K")).forEach(System.out::println);
	}
	
	private static void c(Stream<String> nomes) {				
		boolean a = nomes.map(String::toLowerCase).anyMatch(elem -> elem.startsWith("k"));
		
		if(a)
			System.out.println("Existe");
		else
			System.out.println("Não existe");
	}
}
