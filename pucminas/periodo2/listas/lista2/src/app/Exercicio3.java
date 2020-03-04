package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Exercicio1
 */
public class Exercicio3 implements Exercicio {

    @Override
    public void executa() {
		System.out.print("Digite o valor do salário: ");
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			str = entrada.readLine();
		} catch (IOException e) {

			e.printStackTrace();
		}
		float salario = Float.parseFloat(str);
		if (salario > 1200)
			salario *= 1.1;
		else
			salario *= 1.05;
		System.out.println("Salário é igual a:" + salario);
	}
}