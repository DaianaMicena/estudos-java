

public class Futebol {
	private String nomeTime;
	private int qtdJogador;

	public Futebol(int qtd) {
		this.qtdJogador = qtd;

	}
	
	
	
	public int getQtdJogador() {
		return qtdJogador;
	}

	public void setQtdJogador(int qtdJogador) {
		this.qtdJogador = qtdJogador;
	}


	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	
	public void mostraTime( ) {
		System.out.printf("Seu time � %s\n", getNomeTime());
		System.out.printf("Seu jogadores � %s\n", getQtdJogador());
	}
	

}
