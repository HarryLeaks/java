package ficha1;

import javax.swing.JOptionPane;

public class Calc
{
public static void main(String a[])
{
	double num1, num2, resultado;
	num1 = 999;
	num2 = 0;
	while (num1 != 0) {
		try {
			num1 = Double.parseDouble(
			JOptionPane.showInputDialog("Primeiro Número: (0 = fim)"));
		}catch(NullPointerException|NumberFormatException e) {
			//e.printStackTrace();
			if(e.toString().contains("NullPointerException"))
				System.exit(0);
			
			System.out.println("Num1 : 999");
			num1 = 999;
		}
		if ( num1==0 ) System.exit(0);
		
		try {
			num2 = Double.parseDouble(
			JOptionPane.showInputDialog("Segundo Número: (0 = fim)"));
		}catch(NullPointerException|NumberFormatException e) {
			//e.printStackTrace();
			if(e.toString().contains("NullPointerException"))
				System.exit(0);
			
			System.out.println("Num2 : 500");
			num2 = 999;
		}
		
		if ( num2==0 ) System.exit(0);
		resultado = num1 + num2;
		JOptionPane.showMessageDialog(null, "Soma = " + resultado);
		resultado = num1 * num2;
		JOptionPane.showMessageDialog(null, "Multiplicação = " + resultado);
		resultado = num1 / num2;
		JOptionPane.showMessageDialog(null, "Divisão = " + resultado);
	}
}
}

//NumberFormatException empty String e input string
//NullPointerException