package app;

import static app.Main.readInt;

public class Exercicio13 implements Exercicio {
	@Override
	public void executa() {
		int[][] mat = new int[3][3];
		for (int i = 0, matLength = mat.length; i < matLength; i++) {
			int[] ints = mat[i];
			for (int j = 0, intsLength = ints.length; j < intsLength; j++) {
				mat[i][j] = readInt(String.format("Digite o valor do elemento [%d, %d]", i, j));
			}
		}
		int media = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == j) media += mat[i][j];
			}
		}
		System.out.println(String.format("A média é %d", media));
	}
}
