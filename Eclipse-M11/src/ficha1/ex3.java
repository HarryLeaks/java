package ficha1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ex3 {
	public static void main(String[] args) {
		int[] vetores = {1, 2, 4, 6, 7, 3};
		IntStream vector = Arrays.stream(vetores);
		
		System.out.println(vector.count()); //retorna long type
	}
}
