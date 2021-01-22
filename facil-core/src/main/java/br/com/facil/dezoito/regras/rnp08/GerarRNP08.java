package br.com.facil.dezoito.regras.rnp08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.facil.Combinacoes;
import br.com.facil.excecao.LotoException;
import br.com.facil.regras.pares.RNP08;

public class GerarRNP08 {

	public static void main(String[] args) throws IOException, LotoException {

		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };

		FileWriter arq = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\regras\\GerarRNP08.csv");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		RNP08 rnp08 = new RNP08();
		
		int[] saida;
		int cont = 1;
		Combinacoes comb1 = new Combinacoes(str, 15);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			
			if (rnp08.aplicar(saida)) {
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArq.printf("%s%n", lista);
				
				System.out.println(
					cont + " - " +  saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
									saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
									saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
				);
				cont++;
			}
		}
		
		arq.close();
		gravarArq.close();
	}
}
