class CelulaNumero {

	Numero item;
	CelulaNumero proximo;

	public CelulaNumero(int num) {

		item = new Numero(num);
		proximo = null;
	}

	public CelulaNumero() {

		item = new Numero();
		proximo = null;
	}
}