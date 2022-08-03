package Exceções;

public class NumberFormat {
	public static void main(String args[]) {
		try {
			//abcd não é numero
			int num = Integer.parseInt("abcd");
			System.out.println(num);
		}catch(NumberFormatException e) {
			System.out.println("NumberEception");
		}
	}
}
