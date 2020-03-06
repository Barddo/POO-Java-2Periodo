import java.time.LocalDateTime;

class CelulaCliente {

		Cliente item;
		CelulaCliente proximo;
		
		public CelulaCliente(String nome, LocalDateTime horarioChegada) {
			
			item = new Cliente(nome, horarioChegada);
			proximo = null;
		}
}