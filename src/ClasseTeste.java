
public class ClasseTeste {
	
	private int numero;
	private String nome;
	
	private ClasseTeste() {
		
	}
	
	private ClasseTeste(int numero) {
		
	}
	
	public ClasseTeste(int numero, String nome) {
		this(numero);
		this.nome = nome;
	}
	

}
