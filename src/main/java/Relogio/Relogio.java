package Relogio;

public class Relogio {
	public int hora = 0, minuto = 0, segundo = 0;
	public int dia = 1, mes = 1;
	public static int resto = 0;

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
		validaMes(m + validaDia(d));
	}

	private int validaSeg(int s) {
		resto = 0;
		while (s > 60) {
			resto++;
			s -= 60;
		}
		this.segundo = s;
		return resto;
	}

	private int validaMin(int m) {
		resto = 0;
		while (m > 60) {
			resto++;
			m -= 60;
		}
		this.minuto = m;
		return resto;
	}

	private int validaHora(int h) {
		resto = 0;
		while (h >= 24) {
			resto++;
			h -= 24;
		}
		this.hora = h;
		return resto;
	}

	private int validaDia(int d) {
		resto = 0;
		while (d > 30) {
			resto++;
			d -= 30;
		}
		this.dia = d;
		return resto;
	}

	private void validaMes(int m) {
		resto = 0;
		while (m > 12) {
			m -= 12;
		}
		this.mes = m;
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

	public void passarTempo(int s) {
		validaMes(validaDia(validaHora(this.hora + validaMin(this.minuto + validaSeg(s + this.segundo))) + this.dia)
				+ this.mes);

	}
}
