package atividade1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Compilador {

	public static void main(String[] args) throws IOException {
		
		// Autor: Lucas Linhares
		
		
		// lista para armazenar as linhas do arquivo
		List<String> linhasArquivo = new ArrayList<String>(); 
		
		//Abrindo arquivo
		File arquivo = new File("C:/Users/Alunotgn/eclipse-workspace/texto.txt");
		
		//Verifica se o arquivo existe
		try {
			if (!arquivo.exists()) {
			System.out.println("Arquivo n�o existe");
			}
		
		//construtor que recebe o objeto do tipo arquivo
		FileReader fr = new FileReader( arquivo );
		//construtor que recebe o objeto do tipo FileReader
		BufferedReader br = new BufferedReader( fr );
		
		//enquanto houver mais linhas
		while( br.ready() ){
			
		//l� a proxima linha
		String linha = br.readLine();
		// adicionando cada linha na lista
		if (linha != null) {
			linhasArquivo.add(linha); 
			}
		}
		// fecha o objeto de leitura do arquivo
		br.close(); 
		
		// variavel para auxiliar a verifica��o das palavras
		boolean identificador = false; 
		// variavel para verificar erro
		boolean erro = false;
		
		/*Percorre as linhas do arquivo e separa as palavras assim que encontrar um espa�o em branco, salva as linhas 
		quebradas num vetor e ent�o verifica sua existencia na tabela lexica */
		for (int numLinha = 0; numLinha < linhasArquivo.size(); numLinha++) {
			 // quebra as linhas quando encontra um espa�o
			String[] coluna = linhasArquivo.get(numLinha).split(" ");
			
			// variavel para encontrar a posi��o do erro
			int numColuna = 0; 
			for (String item : coluna) {
				identificador = BaseDados.Verificador(item);
				numColuna++;
				
				// se o identificador for falso, mostra a linha e a coluna do erro e para programa
				if (!identificador) {
					System.err.println("Erro na linha " + (numLinha + 1) + ", coluna " + numColuna);
					erro = true;
					break;
				}
			}
		}
		
		// se n�o foi encontrado nenhum erro
		if (!erro) {
			System.out.println("Programa sem erros lexicos");
		}
		
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}




		
	}	

	}


