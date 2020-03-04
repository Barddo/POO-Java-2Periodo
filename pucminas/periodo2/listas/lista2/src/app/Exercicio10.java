package app;

import java.util.HashMap;
import java.util.Map;

import static app.Main.readInt;

public class Exercicio10 implements Exercicio {
	@Override
	public void executa() {
		int[] nums = new int[6];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = readInt(String.format("Digite o %dº valor", i + 1));
		}
		Map<Integer, Integer> pares = getNumerosDivididosPor(2, nums);
		Map<Integer, Integer> impares = getNumerosDivididosPor(3, nums);
		for (Map.Entry<Integer, Integer> entry : pares.entrySet()) {
			System.out.println(String.format("Número par digitado na posição %d do vetor: %d",
					entry.getKey(), entry.getValue()));
		}

		for (Map.Entry<Integer, Integer> entry : impares.entrySet()) {
			System.out.println(String.format("Número impar digitado na posição %d do vetor: %d",
					entry.getKey(), entry.getValue()));
		}

		System.out.println(String.format("A soma dos números pares digitados é: %d", pares.values().stream()
				.reduce(0, Integer::sum)));

		System.out.println(String.format("A soma dos números impares digitados é: %d", impares.values().stream()
				.reduce(0, Integer::sum)));

	}

	private Map<Integer, Integer> getNumerosDivididosPor(int divisivel, int[] nums) {
		Map<Integer, Integer> pares = new HashMap<>();
		for (int i = 0, numsLength = nums.length; i < numsLength; i++) {
			int num = nums[i];
			if (num % divisivel == 0) pares.put(i, num);
		}
		return pares;
	}
}
