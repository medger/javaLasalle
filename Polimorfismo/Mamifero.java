/*Nome : Geraldo Medina da Silva Junior
* 			Matricula : 0050014094
*/

package Polimorfismo;

public class Mamifero extends Animal{
	
	String corPelo;
	
	
	
	public Mamifero(String corPelo) {
		this.corPelo=corPelo;
	}
	public Mamifero() {
		this.corPelo="Animal Sem cor definida";
	}
	
	public void imprimeCorPelo() {
		System.out.println(this.corPelo);
	}
	
	
	@Override
	public  void locomover() {
		System.out.println("Mamifero andou ");
	}
		
	@Override
	public  void alimentar() {
		System.out.println("Mamifero se alimentou");
	}
	

	@Override
	public void emitirSom() {
		System.out.println("*som de algum mamífero*");
	}

	
}
