/**
 * Bicicleta que irá representar uma bicicleta do mundo real na aula de JAVA e
 * OO, e também servirá o que é e como utilizar os comentários.
 * 
 * @author Tiago Oliveira
 * @since 7 de agosto de 2017
 * @version 1.0.0
 * 
 *
 */
public class Bicicleta {

	/**
	 * Atributo que irá representar a velocidade da bicicleta
	 */
	private float velocidade = 0;
	/**
	 * Atributo que irá armazenar a cadência utilizada no momento. Valor
	 * padrão=0
	 */
	private int cadencia = 0;
	/**
	 * Atributo que irá armazenar a marcha utilizada no momento. Valor padrão=1
	 */
	private int marcha = 1;

	/**
	 * Construtor da classe Bicicleta
	 * 
	 * @param Velocidade velocidade inicial
	 * @param Marcha marcha inicial
	 * @param Cadencia cadência inicial
	 */

	public Bicicleta(float Velocidade, int Marcha, int Cadencia) {
		this.cadencia = Cadencia;
		this.velocidade = Velocidade;
		this.marcha = Marcha;
	}
	
	// outro construtor
	private Bicicleta(int Marcha, float Velocidade, int Cadencia) {
		this.cadencia = Cadencia;
		this.velocidade = Velocidade;
		this.marcha = Marcha;
	}

	/**
	 * Método para retornar a velocidade
	 * 
	 * @return tipo float - velocidade atual
	 */
	public float getVelocidade() {
		return velocidade;
	}

	/**
	 * Método para setar a velocidade atual
	 * 
	 * @param velocidade
	 *            float - velocidade atual
	 */
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	/**
	 * Método para retornar a cadência
	 * 
	 * @return cadencia int - cadência atual
	 */
	public int getCadencia() {
		return cadencia;
	}

	/**
	 * Método para setar a cadência atual
	 * 
	 * @param cadencia
	 *            int - cadência atual
	 */
	public void setCadencia(int cadencia) {
		this.cadencia = cadencia;
	}

	/**
	 * Método para retornar a marcha
	 * 
	 * @return tipo int - marcha atual
	 */
	public int getMarcha() {
		return marcha;
	}

	/**
	 * Método para setar a marcha atual
	 * 
	 * @param marcha
	 *            int - marcha atual
	 */
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

}
