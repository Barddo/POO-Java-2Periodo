package Relogio;

/**
 * Relogio
 */
public class Relogio {
	private int hora = 0, minuto = 0, segundo = 0;
	private int dia = 1, mes = 1;

	public void ajusteHora(int h, int m, int s) {
		validaMes(validaDia(validaHora(h + validaMin(m + validaSeg(s))) + this.dia) + this.mes);
		this.exibeInfomacoes();
	}

	public void ajusteData(int d, int m) {
		validaMes(m + validaDia(d));
		this.exibeInfomacoes();
	}

	private int validaSeg(int s) {
		int resto = 0;
		while (s > 60) {
			resto++;
			s -= 60;
		}
		this.segundo = s;
		return resto;
	}

	private int validaMin(int m) {
		int resto = 0;
		while (m > 60) {
			resto++;
			m -= 60;
		}
		this.minuto = m;
		return resto;
	}

	private int validaHora(int h) {
		int resto = 0;
		while (h >= 24) {
			resto++;
			h -= 24;
		}
		this.hora = h;
		return resto;
	}

	private int validaDia(int d) {
		int resto = 0;
		while (d > 30) {
			resto++;
			d -= 30;
		}
		this.dia = d;
		return resto;
	}

	private void validaMes(int m) {
		while (m > 12) {
			m -= 12;
		}
		this.mes = m;
	}

	public void reiniciar() {
		this.dia = 1;
		this.mes = 1;
		this.minuto = 0;
		this.segundo = 0;
		this.hora = 0;
		this.exibeInfomacoes();
	}

	/**
	 * @return dia em String
	 */
	public String getDia() {
		return formataTempoString(this.dia);
	}

	/**
	 * @return hora em String
	 */
	public String getHora() {
		return formataTempoString(this.hora);
	}

	/**
	 * @return mes em String
	 */
	public String getMes() {
		return formataTempoString(this.mes);
	}

	/**
	 * @return minuto em String
	 */
	public String getMinuto() {
		return formataTempoString(this.minuto);
	}

	/**
	 * @return segundo em String
	 */
	public String getSegundo() {
		return formataTempoString(this.segundo);
	}

	public String formataTempoString(int tempo) {
		if (tempo < 10 && tempo >= 0) {
			return "0".concat(Integer.toString(tempo));
		}
		return Integer.toString(tempo);
	}

	public void exibeInfomacoes() {
		System.out.println("Horário: " + getHora() + ":" + getMinuto() + ":" + getSegundo());
		System.out.println("Dia: " + getDia() + ", Mes: " + getMes());
	}

	public void passarTempo(int s) {
		validaMes(validaDia(validaHora(this.hora + validaMin(this.minuto + validaSeg(s + this.segundo))) + this.dia)
				+ this.mes);
		this.exibeInfomacoes();
	}

	private int readInt(String textoSaida) {
		System.out.println(textoSaida);
		String operacao;
		int numero = 0;
		try {
			operacao = App.readLine();
			numero = Integer.parseInt(operacao);
			if (numero < 0) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Entrada inválida, digite novamente:");
			numero = this.readInt(textoSaida);
		}
		return numero;
	}

	private int validaEntrada() {
		String operacao;
		int numOperador = 0;
		try {
			operacao = App.readLine();
			numOperador = Integer.parseInt(operacao);
			if (numOperador < 0 || numOperador > 5) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Entrada inválida, digite novamente:");
			numOperador = validaEntrada();
		}
		return numOperador;
	}

	public void interpreta() throws InterruptedException {
		int opcao = validaEntrada();
		switch (opcao) {
		case 0:
			System.exit(0);
			break;
		case 1:
			this.ajusteHora(this.readInt("Digite as horas:"), this.readInt("Digite os minutos:"),
					this.readInt("Digite os segundos:"));
			break;
		case 2:
			this.ajusteData(this.readInt("Digite o dia:"), this.readInt("Digite o mês:"));
			break;
		case 3:
			this.passarTempo(this.readInt("Digite os segundos:"));
			break;
		case 4:
			this.exibeInfomacoes();
			break;
		case 5:
			this.reiniciar();
		}
	}
}
