/*
* Grupo : 
* 			Nome : Fernando Albuquerque silva
* 			Matricula : 0050005653
* 
* 			Nome : Geraldo Medina da Silva Junior
* 			Matricula : 0050014094
* 
* 			Nome : Vitor Gomes Doherty
* 			Matricula : 0050014453
* 
*/


package TrabalhoCampeonatoFutebol;

public class TimeDeFutebol {
	
	private int numeroDeTorcida;
	private static int totalTime;
	

	public int getNumeroDeTorcida() {
		return this.numeroDeTorcida;
	}

	public void setNumeroDeTorcida(int numeroDeTorcida) {
		this.numeroDeTorcida = numeroDeTorcida;
	}

	  public static void settotalTime() {
	        totalTime++;	   
	        
	  }
	  
	  public static int gettotalTime() {
		  return TimeDeFutebol.totalTime;
	  }
	
	
}