/*Nome : Geraldo Medina da Silva Junior
* 			Matricula : 0050014094
*/

package Polimorfismo;

public class Ave extends Animal{
	
	String corPena;
	
	public Ave(String corPena) {
		this.corPena=corPena;
	}

	public Ave() {
		this.corPena=" Cor da pena nao definida";
	}

	public void imprimeCorPena() {
		System.out.println(this.corPena);
	}
	public void fazerNinho() {
		System.out.println("A ave fez um ninho!");
	}
	@Override
	public void locomover() {
		System.out.println("Ave voou!");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Ave se alimentou");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("pruu!");
		
	}
	
}
