package Relogio;

public class Relogio {
	public int hora = 0, minuto = 0, segundo = 0;
	public int dia = 1, mes = 1;

	public void ajusteHora(int h, int m, int s) {
		validaSeg(s);
		validaMin(m);
		validaHora(h);
	}

	public void ajusteData(int d, int m) {
		validaDia(d);
		validaMes(m);
	}

	public void reiniciar(int h, int m, int s) {
		this.dia = 1;
		this.mes = 1;
		this.minuto = 0;
		this.segundo = 0;
		this.hora = 0;
	}

	private void validaSeg(int s) {
		while (s > 60) {
			this.minuto++;
			s -= 60;
		}
		this.segundo = s;
	}

	private void validaMin(int m) {
		while (m > 60) {
			this.hora++;
			m -= 60;
		}
		this.minuto = m;

	}

	private void validaHora(int h) {
		while (h > 24) {
			this.dia++;
			h -= 24;
		}
		this.hora = h;
	}

	private void validaDia(int d) {
		while (d > 30) {
			this.mes++;
			d -= 30;
		}
		this.dia = d;
	}

	private void validaMes(int m) {
		this.mes = m;
		while (m > 12) {
			this.mes--;
		}
	}

	public void exibeInfomacoes() {
		System.out.println("Horas: " + this.hora + ", Minutos: " + this.minuto + ", Segundos: " + this.segundo);
		System.out.println("Dia: " + this.dia + ", Mes: " + this.mes);
	}

	// public void passarTempo(int s) {

	// }
}
