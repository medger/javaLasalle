/*Nome : Geraldo Medina da Silva Junior
* 			Matricula : 0050014094
*/

package Polimorfismo;

public class Canguru extends Mamifero{

	public Canguru(String corPelo) {
		this.corPelo=corPelo;
	}
	
	public Canguru() {
		this.corPelo="Cor do pelo nao definida!";
	}
	
	@Override
	public void imprimeCorPelo() {
		System.out.println(this.corPelo);
	}
	
	@Override
	public  void locomover() {
		System.out.println("Canguru pulou");
	}
		
	@Override
	public  void alimentar() {
		System.out.println("Canguru se alimentou");
	}
	

	@Override
	public void emitirSom() {
		System.out.println("toin toin *barulho de quem pula*");
	}

	
}