package app;

import static app.Main.readInt;

public class Exercicio6 implements Exercicio {
	@Override
	public void executa() {
		int num1 = 0, num2 = 0;
		num1 = readInt("Digite o primeiro número: ");
		num2 = readInt("Digite o segundo número: ");

		int resultado = num1 + num2;
		System.out.println(resultado + " é " + (resultado % 2 == 0 ? "par" : "ímpar"));
	}
}
