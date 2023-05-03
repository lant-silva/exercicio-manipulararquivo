package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arquivo implements ILerArquivo {

	@Override
	public void lerArquivo(String path, String name) throws IOException {
		File arquivo = new File(path, name);
		if(arquivo.exists() && arquivo.isFile()) {
			FileInputStream fluxo = new FileInputStream(arquivo);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null) {
				boolean contem = false;
				String[] lista = linha.split(",");
				for(String fruta : lista) {
					if(lista[2].contains("Fruits")) {
						contem = true;
						System.out.print(fruta+"\t\t");
					}
				}
				if(contem) {
					 System.out.println();
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		}else {
			throw new IOException("Arquivo Inválido");
		}
	}
}
