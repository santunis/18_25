package br.com.facil.combinacoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.facil.Combinacoes;
import br.com.facil.excecao.LotoException;

public class Gerar1625CSV {

	public static void main(String[] args) throws IOException, LotoException {

		String[] str = { 
/*			|#########################################|
/*			|*/		"1", "2", "3", "4", "5",		//|
/*			|#########################################|
/*			|*/		"6", "7", "8", "9", "10",		//|
/*			|#########################################|
/*			|*/		"11", "12", "13", "14", "15",	//|
/*			|#########################################|
/*			|*/		"16", "17", "18", "19", "20",	//|
/*			|#########################################|
/*			|*/		"21", "22", "23", "24", "25"	//|
//			|#########################################|
		};

		FileWriter arq = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\16_25.csv");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		String[] saida;
		long cont = 1;
		Combinacoes comb1 = new Combinacoes(str, 16);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
					saida[15];
			gravarArq.printf("%s%n", lista);
			
			System.out.println(
				cont + " - " +  saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
								saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
								saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
								saida[15]
			);
			cont++;
		}

		arq.close();
		gravarArq.close();
	}

}
