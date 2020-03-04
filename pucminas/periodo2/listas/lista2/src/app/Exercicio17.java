package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio17 implements Exercicio {
	@Override
	public void executa() {
		System.out.println("Digite uma frase a ser invertida.");
		String frase = null;
		try {
			frase = new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringBuilder auxFrase = new StringBuilder();

		for (int i = frase.length() - 1; i >= 0; i--)
			auxFrase.append(frase.charAt(i));

		System.out.println(auxFrase.toString());
	}
}
