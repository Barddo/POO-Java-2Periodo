package app.relogio;

public class Relogio {
	public int hora = 0, minuto = 0, segundo = 0;
	public int dia = 1, mes = 1;

	public void ajusteHora(int h, int m, int s) {
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}

	public void ajusteData(int d, int m) {
		while (d > 30) {
			d -= 30;
			m++;
		}
		while (m > 12) {
			m -= 12;
		}

		this.dia = d;
		this.mes = (m > 12 ? m -= 12 : m);
		System.out.printf("dia: {0}, mes {1} ", this.dia, this.mes);
	}

	public void reiniciar(int h, int m, int s) {
		this.dia = 1;
		this.mes = 1;
		this.minuto = 0;
		this.segundo = 0;
		this.hora = 0;
	}

	private void validaSeg(int s) {
while (s >60) {
	this.minuto++;
	s-=60;
}
	}

	private void validaMin(int h) {

	}

	private void validaHora(int h) {

	}

	private void validaDia(int h) {

	}

	private void validaMes(int h) {

	}

	public void passarTempo(int s) {

	}
}
