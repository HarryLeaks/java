package Exce��es;

public class NumberFormat {
	public static void main(String args[]) {
		try {
			//abcd n�o � numero
			int num = Integer.parseInt("abcd");
			System.out.println(num);
		}catch(NumberFormatException e) {
			System.out.println("NumberEception");
		}
	}
}
