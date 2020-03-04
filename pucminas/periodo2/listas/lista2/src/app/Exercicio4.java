package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static app.Main.readInt;

/**
 * Exercicio2
 */
public class Exercicio4 implements Exercicio {

	@Override
	public void executa() {
		System.out.println("Digite 1 para somar dois números\nDigite 2 para descobrir a raiz de um número");
		System.out.print("Digite a opção desejada: ");
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String opcao = null;

		try {
			opcao = entrada.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		switch (opcao) {
			case "1":
				int num1 = 0, num2 = 0;

				try {
					num1 = readInt("Digite o primeiro número: ");
					num2 = readInt("Digite o segundo número: ");
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
				System.out.println("O resultado é: " + (num1 + num2));
				break;
			case "2":
				int numExp = 0;

				try {
					numExp = readInt("Digite o número: ");
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
				System.out.println("A raiz de " + numExp + " é igual a: " + String.format("%.2f", Math.sqrt(numExp)));
				break;
			default:
				break;
		}
	}


}