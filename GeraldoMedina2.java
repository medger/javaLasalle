package primeiraTarefa;

/* Geraldo Medina - 0050005653*/

import java.util.Scanner;

public class GeraldoMedina2 {

	public static void main(String[] args) {
		int Numero;

		do {
				Scanner input=new Scanner(System.in);

				System.out.print("Digite o numero e diremos se é par ou impar : ");
				
				Numero = input.nextInt();

				if (Numero % 2 == 0 && Numero !=0) {
					System.lineSeparator();    
					System.lineSeparator();    
					System.out.println("Sabia que era par =)\n");
					
				}else {				
					System.lineSeparator(); 
					System.lineSeparator();    
					System.out.println("Caramba, é impar! =o\n");
				}
				
		} while (Numero != 0);
		

	}

}