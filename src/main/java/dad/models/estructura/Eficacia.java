package dad.models.estructura;

public enum Eficacia {

	INEFICAZ(0),POCOEFICAZ(50),NORMAL(100),MUYEFICAZ(200);
	
	private final int valor;
	
	private Eficacia(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}
