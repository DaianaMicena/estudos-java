package HealthTrackStage;

public class Cliente {

	private String cliente;
	private int cpf;
	private String endereco;
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void incluirCliente() {
		System.out.println("Método para inclusão de clientes no Banco de Dados");
	}
	
	public void alterarCliente() {
		System.out.println("Método para alteração de clientes no Banco de Dados");
	}
	
	public void excluirCliente() {
		System.out.println("Método para exclusão de clientes no Banco de Dados");
	}
	
	
}

