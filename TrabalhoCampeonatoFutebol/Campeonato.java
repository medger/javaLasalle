package TrabalhoCampeonatoFutebol;

public class Campeonato {
	public void resultadoPartida(ITime time1, int gols1, ITime time2, int gols2) {
		if (gols1 > gols2) {
			time1.adicionarVitoria();
			time2.adicionarDerrota();
		}
		if (gols1 < gols2) {
			time1.adicionarDerrota();
			time2.adicionarVitoria();
		}
		if (gols1 == gols2) {
			time1.adicionarEmpate();
			time2.adicionarEmpate();
		}

	}

	public void listarRank(ITime time[]) {
		ITime[] lista = new ITime[time.length];
		
		ITime aux;
		String[][] mat = new String[time.length+1][6];

		for (int i = 0; i < time.length; i++) {
			lista[i] = time[i];
		}
	
		for (int i = 0; i < lista.length; i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i].totalPontos() < lista[j].totalPontos()) {
					aux = lista[j];
					lista[j] = lista[i];
					lista[i] = aux;
				}
			}

		}

		mat[0][0] = "Pts";
		mat[0][1] = "Nome";
		mat[0][2] = "Jogos";
		mat[0][3] = "Empate";
		mat[0][4] = "Vitoria";
		mat[0][5] = "Derrota";

		for (int i = 1; i <= time.length; i++) {
			
			mat[i][0] = String.valueOf(lista[i - 1].totalPontos());
			mat[i][1] = String.valueOf(lista[i - 1].getNome());
			mat[i][2] = String.valueOf(lista[i - 1].getVitoria() + lista[i - 1].getEmpate() + lista[i - 1].getDerrota());
			mat[i][3] = String.valueOf(lista[i - 1].getEmpate());
			mat[i][4] = String.valueOf(lista[i - 1].getVitoria());
			mat[i][5] = String.valueOf(lista[i - 1].getDerrota());
		}

		
		System.out.println(">> Classificação Campeonato Carioca<< ");
		
		for (int i = 0; i < time.length+1; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.printf("%15s", mat[i][j]);

			}
			System.out.println("");
		}

	}
}
