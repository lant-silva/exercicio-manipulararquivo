package view;

import controller.Arquivo;
import controller.ILerArquivo;

public class Main {

	public static void main(String[] args) {
		
		String arquivo = "generic_food.csv";
		String path = "/tmp"; //eu uso linux então eu coloquei aqui
		
		ILerArquivo ler = new Arquivo();
		
		try {
			ler.lerArquivo(path, arquivo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
