package app;

public class Exercicio11 implements Exercicio {
	@Override
	public void executa() {
		int qnt = 15;
		char[] chars = new char[qnt];
		System.out.println("Digite um dígito para cada posição.");
		for (int i = 0; i < chars.length; i++) {
			chars[i] = Main.readLine(String.format("Digite a %dº posição do vetor", i)).charAt(0);
		}
		char aux;
		for (int i = 0; i < qnt / 2; i++) {
			aux = chars[i];
			chars[i] = chars[qnt - i - 1];
			chars[qnt - i - 1] = aux;
		}
		System.out.println("O vetor invertido: " + chars);
	}
}
