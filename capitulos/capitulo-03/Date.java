

public class Date{
	
	private int mes;
	private int dia;
	private int ano;
	
	public Date(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void setDia( int dia ){
		this.dia = dia;
	}
	
	public int getDia(){
		return this.dia;
	}
	
	public void setMes(int mes){
		this.mes = mes;
	}
	
	public int getMes(){
		return this.mes;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	
	public int getAno(){
		return this.ano;
	}
	
	public String displayDate(){
		return String.format("%02d/%02d/%d", getDia(), getMes(), getAno());
	}
}