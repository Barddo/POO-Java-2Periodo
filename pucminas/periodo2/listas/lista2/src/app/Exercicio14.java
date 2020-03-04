package app;

import static app.Main.readInt;

public class Exercicio14 implements Exercicio {
	@Override
	public void executa() {
		int[][] mat = new int[3][4];
		for (int i = 0, matLength = mat.length; i < matLength; i++) {
			int[] ints = mat[i];
			for (int j = 0, intsLength = ints.length; j < intsLength; j++) {
				mat[i][j] = readInt(String.format("Digite o valor do elemento [%d, %d]", i, j));
			}
		}
		int maior = mat[0][0], menor = mat[0][0];
		String indiceMenor = null, indiceMaior = null;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int num = mat[0][0];
				if (num > maior) {
					maior = num;
					indiceMaior = i + ", " + j;
				}
				if (num < menor) {
					menor = num;
					indiceMenor = i + ", " + j;
				}
			}
		}
		System.out.println(String.format("O maior valor é %d, de índice %s", maior, indiceMaior));

		System.out.println(String.format("O menor valor é %d, de índice %s", menor, indiceMenor));
	}
}
