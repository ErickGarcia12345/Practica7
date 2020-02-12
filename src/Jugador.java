
public class Jugador {
	private String codigo;
	private String nombre;
	private String procedencia;
	private String altura;
	private String peso;
	private String posicion;
	private String equipo;
	
	public Jugador() {
		
	}

	public Jugador(String codigo, String nombre, String procedencia, String altura, String peso, String posicion,
			String equipo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
		this.equipo = equipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Jugador [codigo=" + codigo + ", nombre=" + nombre + ", procedencia=" + procedencia + ", altura="
				+ altura + ", peso=" + peso + ", posicion=" + posicion + ", equipo=" + equipo + "]";
	}
	
	


}
