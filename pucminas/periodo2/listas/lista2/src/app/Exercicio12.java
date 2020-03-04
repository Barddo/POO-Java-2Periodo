package app;

import static app.Main.readLine;

public class Exercicio12 implements Exercicio {
	@Override
	public void executa() {
		short qntQuestoes = 8, qntAlunos = 10;
		char[] opcoes = new char[]{
				'A', 'B', 'C', 'D', 'E'
		};
		System.out.println("Valores válidos para as questões 'A', 'B', 'C', 'D', e 'E'");
		char[] gabarito = new char[qntQuestoes];
		for (int i = 0, gabaritoLength = gabarito.length; i < gabaritoLength; i++) {
			gabarito[i] = readLine(String.format("Digite a resposta da %dº questão da prova", i + 1)).charAt(0);
		}

		int[] notasAlunos = new int[qntAlunos];
		float porcentagem = 0F;
		for (int i = 0, notasAlunosLength = notasAlunos.length; i < notasAlunosLength; i++) {
			int resultado = 0;
			for (int j = 0; j < qntQuestoes; j++) {
				char resposta = readLine(String.format("Digite a questão marcada pelo aluno %d, na %d questão.", i, j)).charAt(0);
				if (resposta == gabarito[j]) resultado++;
			}
			notasAlunos[i] = resultado;
			if (resultado >= 5) porcentagem++;
		}

		for (int i = 0, notasAlunosLength = notasAlunos.length; i < notasAlunosLength; i++) {
			System.out.println(String.format("A nota do %dº aluno na prova é %d", i + 1, notasAlunos[i]));
		}

		System.out.println(String.format("A porcentagem dos alunos aprovados foi %.2f", (porcentagem / qntAlunos)));
	}
}
