package app;

public class Exercicio7 implements Exercicio {
	@Override
	public void executa() {
		float[] veiculos = new float[5];
		float multa = 0;
		for (int i = 0; i < veiculos.length; i++) {
			veiculos[i] = Main.readFloat(String.format("Digite a velocidade do %dº veículo", i+1));
		}

		for (int i = 0; i < veiculos.length; i++) {
			float f = veiculos[i];
			if (f > 60) {
				multa += 150;
				System.out.println(String.format("O %dº veículo foi multado em R$150.00", i+1));
			}
		}
		System.out.println(String.format("O total arrecadado foi %.2f", multa));
	}
}
