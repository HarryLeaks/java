package ficha1;

import java.util.Arrays;
import java.util.stream.Stream;

public class ex1 {
	public static void main(String []args) {
		Double[] vetor = {3.0, 7.0, 3.0, 1.0, -2.0, 0.0, 4.0, 5.0, 0.0, 0.0, 10.0, 12.0, 14.0, 20.0, 3.0};
		
		Stream<Double> maxv = Arrays.stream(vetor);
		maxv.reduce(Double::max).ifPresent(s -> System.out.println(s)); 
	}
}
