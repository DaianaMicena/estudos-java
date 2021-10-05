package HealthTrackStage;

import java.util.Date;

public class Alimentacao {
	
	private String alimento;
	private Date data;
	private double hora; 
	private double calorias;
	private int quantidade;
	
	
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double calcularCaloria() {
	double calcularCaloria = this.getCalorias()*this.getQuantidade();
	return calcularCaloria();
	}
		
	
}

