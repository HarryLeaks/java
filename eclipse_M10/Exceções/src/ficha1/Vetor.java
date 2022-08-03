package ficha1;

public class Vetor {
	public static void main(String[] args) {
		//nao corrigido
		/*int Vetor[] = {1,2,3,4,5};
		System.out.println(Vetor[7]);*/
		int Vetor[] = {1,2,3,4,5};
		
		try {
			System.out.println(Vetor[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Erro: ArrayIndexOutOfBoundsException");
		}
	}
}
