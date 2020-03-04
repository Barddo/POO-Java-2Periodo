package app;

import java.util.Arrays;

import static app.Main.readInt;

public class Exercicio15 implements Exercicio {
	@Override
	public void executa() {

		int[] vetor1 = preencheVetor(10);
		int[] vetor2 = preencheVetor(10);
		int[] mutiplicaVetores = mutiplicaVetores(vetor1, vetor2);
		System.out.println("Resultado: " + Arrays.toString(mutiplicaVetores));
	}

	private int[] preencheVetor(int x) {
		int[] mat = new int[x];
		for (int i = 0, matLength = mat.length; i < matLength; i++) {
			mat[i] = readInt(String.format("Digite o valor do elemento %d", i));
		}
		return mat;
	}

	private int[] mutiplicaVetores(int[] x, int[] y) {
		int[] mat = new int[x.length];
		for (int i = 0, matLength = x.length; i < matLength; i++) {
			mat[i] = x[i] * y[i];
		}
		return mat;
	}
}
