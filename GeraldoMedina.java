package primeiraTarefa;

/* Geraldo Medina - 0050005653*/


import java.util.Scanner;

public class GeraldoMedina {

	public static void main(String[] args) {
		int Numero;
		
		System.out.print("Digite o numero para ver sua tabuada .");
		
		Scanner input=new Scanner(System.in);
		
		Numero = input.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(Numero + " x " +i + " = " + (i*Numero) );
		}
		
	}
}