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

public class PartidaTester {

	public static void main(String[] args) {
		
		Flamengo flamengo = new Flamengo();
		Fluminense fluminense = new Fluminense();
		Vasco vasco = new Vasco();
		Botafogo botafogo = new Botafogo();
		Palmeiras palmeiras= new Palmeiras();
		SaoPaulo saoPaulo = new SaoPaulo();
		
		
		ITime time[] = new ITime[TimeDeFutebol.gettotalTime()];
		
		
		
		time[0] = flamengo;
		time[1] = fluminense;
		time[2] = vasco;
		time[3] = botafogo;
		time[4] = palmeiras;
		time[5] = saoPaulo;
		
	
		Campeonato campeonato = new Campeonato();
		

		campeonato.resultadoPartida(flamengo, 3, fluminense, 1);

		campeonato.resultadoPartida(flamengo, 2, botafogo, 4);

		campeonato.resultadoPartida(flamengo, 3, vasco, 3);

		campeonato.resultadoPartida(vasco, 2, botafogo, 4);

		campeonato.resultadoPartida(vasco, 1, fluminense, 2);

		campeonato.resultadoPartida(fluminense, 2, botafogo, 5);

		campeonato.listarRank(time);

	}

}