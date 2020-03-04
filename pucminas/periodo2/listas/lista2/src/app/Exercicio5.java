package app;

import static app.Main.readFloat;

public class Exercicio5 implements Exercicio {

	@Override
	public void executa() {
		float nota1, nota2, nota3;
		nota1 = readFloat("Digite a primeira nota do aluno: ");
		nota2 = readFloat("Digite a segunda nota do aluno: ");
		nota3 = readFloat("Digite a terceira nota do aluno: ");

		System.out.println(avalia(nota1, nota2, nota3));

	}

	private String avalia(float... notas) {
		float resultado = 0;
		String msg = null;
		for (float nota : notas) {
			resultado += nota;
		}
		resultado /= notas.length;
		if (resultado > 0 && resultado < 4)
			msg = "Reprovado";
		else if (resultado >= 4 && resultado < 6)
			msg = "Exame Especial";
		else if (resultado >= 6 && resultado <= 10)
			msg = "Aprovado";
		System.out.println("Média igual = " + String.format("%.2f", resultado));
		return msg;
	}
}
