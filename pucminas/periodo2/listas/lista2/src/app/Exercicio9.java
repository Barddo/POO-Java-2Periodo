package app;

import static app.Main.readFloat;
import static app.Main.readInt;

public class Exercicio9 implements Exercicio {
	@Override
	public void executa() {
		switch (readInt("1. Média Aritmética\n" +
				"2. Média Ponderada\n" +
				"3. Média Aritmética e Ponderada\n" +
				"4. Sair")) {
			case 1:
				double aritmetica = mediaAritmetica(3);
				System.out.println(String.format("A média aritmética dos números é: %f", aritmetica));
				break;
			case 2:
				double ponderada = mediaPonderada(3);
				System.out.println(String.format("A média aritmética dos números é: %f", ponderada));
				break;
			case 3:
				double aritmetica1 = mediaAritmetica(3);
				double ponderada1 = mediaPonderada(3);
				System.out.println(String.format("A média aritmética dos números é: %f", aritmetica1));
				System.out.println(String.format("A média aritmética dos números é: %f", ponderada1));
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Comando inválido");
				System.exit(0);
				break;
		}
	}

	private double mediaAritmetica(int qnt) {
		double resultado = 0D;
		for (int i = 0; i < qnt; i++) {
			resultado += readFloat(String.format("Digite o %dº número", i + 1));
		}
		return resultado / qnt;
	}

	private double mediaPonderada(int qnt) {
		double resultado = 0D, div = 0D;
		float[] pesos = new float[qnt];
		float[] valores = new float[qnt];
		for (int i = 0; i < qnt; i++) {
			valores[i] = readFloat(String.format("Digite o %dº número:", i + 1));
			pesos[i] = readFloat("Digite o peso do valor:");
		}
		for (int i = 0; i < valores.length; i++) {
			resultado += valores[i] * pesos[i];
			div += valores[i];
		}
		return resultado / div;
	}
}
