package Relogio;

import java.text.MessageFormat;

/**
 * Relogio
 */
public class Relogio {
	private int hora, minuto, segundo;
	private int dia, mes;
	private int[] diasMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int ano;
	private static int resto = 0;

	public Relogio() {
		hora = minuto = segundo = 0;
		dia = mes = 1;
		ano = 2000;
	}

	public boolean bissexto(int num) {
		if (this.ano % 4 == 0 && this.ano % 100 != 0) {
			diasMes[2] = 29;
			return true;
		}
		return false;
	}

	public void ajusteHora(int h, int m, int s) {
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
		while (d > diasMes[this.mes]) {
			resto++;
			d -= diasMes[this.mes];
		}
		this.dia = d;
		return resto;
	}

	private int validaMes(int m) {
		resto = 0;
		while (m > 12) {
			this.ano++;
			m -= 12;
		}
		this.mes = m;
		return resto;
	}

	public void reiniciar() {
		this.dia = 1;
		this.mes = 1;
		this.minuto = 0;
		this.segundo = 0;
		this.hora = 0;
	}

	/**
	 * @return dia em String
	 */
	public String getDia() {
		return String.format("%02d", this.dia);
	}

	/**
	 * @return hora em String
	 */
	public String getHora() {
		return String.format("%02d", this.hora);
	}

	/**
	 * @return mes em String
	 */
	public String getMes() {
		return String.format("%02d", this.mes);
	}

	/**
	 * @return minuto em String
	 */
	public String getMinuto() {
		return String.format("%02d", this.minuto);
	}

	/**
	 * @return segundo em String
	 */
	public String getSegundo() {
		return String.format("%02d", this.segundo);
	}

	/**
	 * @return ano em String
	 */
	public String getAno() {
		return String.format("%04d", this.ano);
	}

	public String exibeInfomacoes() {
		Object[] params = new Object[] { "Horário", getHora(), ":", getMinuto(), ":", getSegundo(), "\nDia:", getDia(),
				", Mes:", getMes(), ", Ano:", getAno() };

		return MessageFormat.format("{0} {1}{2}{3}{4}{5} {6}{7}{8}{9}{10}{11}", params);
	}

	public void passarTempo(int s) {
		validaMes(validaDia(validaHora(this.hora + validaMin(this.minuto + validaSeg(s + this.segundo))) + this.dia)
				+ this.mes);
	}
}
