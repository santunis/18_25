package br.com.facil.dezoito.fechamento;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.facil.Combinacoes;
import br.com.facil.excecao.LotoException;

public class GerarFechamento {

	public static void main(String[] args) throws IOException, LotoException {
		
		//1,2,3,4,7,8,9,11,12,14,15,16,17,18,20,21,24,25 -> 06-01-2021
		//2,3,4,5,6,7,9,10,11,12,13,14,16,17,20,21,22,24 -> 07-01-2021
		
		//1,3,4,5,6,7,9,10,12,14,15,16,18,20,21,22,23,25
		//String[] str = { "1","3","4","5","6","7","9","10","12","14","15","16","18","20","21","22","23","25" };
		
		//1,3,4,5,6,8,9,10,13,14,15,17,18,20,21,22,23,25
//		String[] str = { "1","2","3","5","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","24" };
		
		//1,2,3,6,7,8,9,11,12,13,15,16,17,19,21,23,24,25
		//7,8,9,10,11,12,13,15,16,17,19,20,21,23,24
		String[] str = { "1","2","3","5","6","7","8","9","10","11","12","13","15","16","17","19","20","21","23","24","25" };
		
		FileWriter arq = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\fechamento\\GerarFechamento21_11012021.csv");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		String[] saida;
		long cont = 0;
		Combinacoes comb1 = new Combinacoes(str, 15);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
			
			gravarArq.printf("%s%n", lista);
			
			cont++;
			System.out.println(cont + " - " + 
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		
		arq.close();
		gravarArq.close();
	}

}
