package app;

import static app.Main.readInt;

public class Exercicio8 implements Exercicio {
	@Override
	public void executa() {
		int qnt = readInt("Digite a quantidade de valores a serem lidos a fim de obter seus respectivos fatoriais.");
		int[] nums = new int[qnt];
		for (int i = 0; i < qnt; i++) {
			nums[i] = readInt(String.format("Digite o %dº valor", i + 1));
		}

		for (int n : nums) {
			System.out.println(String.format("O fatorial de %d é %d", n, fatorial((long) n)));
		}
	}

	public long fatorial(long n) {
		if (n == 0)
			return 1;
		else
			return (n * fatorial(n - 1));
	}
}
