/*Nome : Geraldo Medina da Silva Junior
* 			Matricula : 0050014094
*/

package Polimorfismo;

public class Peixe extends Animal{

	String corEscama;
	
	public Peixe(String corEscama) {
		this.corEscama=corEscama;
	}
	public Peixe() {
		this.corEscama="Cor da escama nao definida";
	}
	
	public void soltarBolha() {
		System.out.println("Peixe soltou bolhas!");
	}
	
	public void imprimeCorEscama() {
		System.out.println(this.corEscama);
	}
	
	@Override
	public void locomover() {
		System.out.println("Peixe nadou");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Peixe se alimentou");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("glup");
		
	}
	
}