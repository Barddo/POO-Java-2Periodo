package Relogio;

public class Relogio {
	public int hora = 0, minuto = 0, segundo = 0;
	public int dia = 1, mes = 1;
	public static int contador = 0;

	public void ajusteHora(int h, int m, int s) {
		// int cicloRestoMin = validaSeg(s);
		// int cicloRestoHora = validaMin(m + validaSeg(s));
		// int cicloRestoDia = validaHora(h + validaMin(m + validaSeg(s)));
		// int cicloRestoMes = validaDia(validaHora(h + validaMin(m + validaSeg(s))) +
		// this.dia);
		/*
		 * São semelhantes, o código abaixo é muito mais ilegível que o acima,no entanto
		 * é menos verboso.
		 */
		validaMes(validaDia(validaHora(h + validaMin(m + validaSeg(s))) + this.dia) + this.mes);
	}

	public void ajusteData(int d, int m) {
		int cicloRestoMes = validaDia(d);
		validaMes(m + cicloRestoMes);
	}

	private int validaSeg(int s) {
		contador = 0;
		while (s > 60) {
			contador++;
			s -= 60;
		}
		this.segundo = s;
		return contador;
	}

	private int validaMin(int m) {
		contador = 0;
		while (m > 60) {
			contador++;
			m -= 60;
		}
		this.minuto = m;
		return contador;
	}

	private int validaHora(int h) {
		contador = 0;
		while (h >= 24) {
			contador++;
			h -= 24;
		}
		this.hora = h;
		return contador;
	}

	private int validaDia(int d) {
		contador = 0;
		while (d > 30) {
			contador++;
			d -= 30;
		}
		this.dia = d;
		return contador;
	}

	private void validaMes(int m) {
		contador = 0;
		this.mes = m;
		while (m > 12) {
			this.mes--;
		}
	}

	public void reiniciar(int h, int m, int s) {
		this.dia = 1;
		this.mes = 1;
		this.minuto = 0;
		this.segundo = 0;
		this.hora = 0;
	}

	public void exibeInfomacoes() {
		System.out.println("Horas: " + this.hora + ", Minutos: " + this.minuto + ", Segundos: " + this.segundo);
		System.out.println("Dia: " + this.dia + ", Mes: " + this.mes);
	}

	// public void passarTempo(int s) {

	// }
}
