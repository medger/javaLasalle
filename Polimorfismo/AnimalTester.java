/*Nome : Geraldo Medina da Silva Junior
* 			Matricula : 0050014094
*/

package Polimorfismo;

public class AnimalTester {

	public static void main(String[] args) {
		
		Mamifero mamifero = new Mamifero("cinza");
		Canguru canguru = new Canguru();
		Reptil reptil = new Reptil("verde");
		Peixe peixe = new Peixe();
		Ave ave = new Ave("amarela");
		

		System.out.println("Mamifero:");
		mamifero.imprimeCorPelo();
		mamifero.locomover();
		mamifero.alimentar();
		mamifero.emitirSom();

		
		System.out.println("Canguru:");
		canguru.imprimeCorPelo();
		canguru.locomover();
		canguru.alimentar();
		canguru.emitirSom();


		System.out.println("Reptil:");
		reptil.imprimeCorEscama();
		reptil.locomover();
		reptil.alimentar();
		reptil.emitirSom();


		System.out.println("Peixe:");
		peixe.imprimeCorEscama();
		peixe.soltarBolha();
		peixe.locomover();
		peixe.alimentar();
		peixe.emitirSom();


		System.out.println("Ave:");
		ave.imprimeCorPena();
		ave.fazerNinho();
		ave.locomover();
		ave.alimentar();
		ave.emitirSom();

		
		
	}

}