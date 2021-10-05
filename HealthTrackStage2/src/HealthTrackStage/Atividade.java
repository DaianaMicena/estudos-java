package HealthTrackStage;

import java.util.Date;

public class Atividade {
	
	private int codAtividade;
	private Date data;
	private double qtdeHora;
	private double calorias;
	
	public int getCodAtividade() {
		return codAtividade;
	}
	public void setCodAtividade(int codAtividade) {
		this.codAtividade = codAtividade;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getQtdeHora() {
		return qtdeHora;
	}
	public void setQtdeHora(double qtdeHora) {
		this.qtdeHora = qtdeHora;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	
	public double calcularCaloria() {
	double calcularCaloria = this.getCodAtividade()*this.getCalorias()*this.getQtdeHora();
	return calcularCaloria();
		
	}
	
}
