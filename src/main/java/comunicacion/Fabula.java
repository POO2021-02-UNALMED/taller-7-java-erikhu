package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;

	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.setEnsenanza(ensenanza);
		this.interpretacion = interpretacion;
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		return palabrasPagina * getPaginas() * 1;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		return String.format("%s\n%s\n%s\n%d\n%s", getOrigen(), getTitulo(), getAutor(), getPaginas(), ensenanza);
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

}
