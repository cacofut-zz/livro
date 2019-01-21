

public class Student{
	
	private String nome;
	private double media;
	
	public Student(String nome, double media){
		this.nome = nome;		
		this.media = ( media > 0 && media <= 100 ) ? media : 0.0;
	}
	
	public String getNome(){
		return nome;		
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getMedia(){
		return media;
	}
	
	public void setMedia(double media){
		this.media = ( media > 0 && media <= 100 ) ? media : 0.0;
	}
	
	public String getLetraGrade(){		
		if( media >= 90.0 ) return "A";
		else if( media >= 80.0 ) return "B";
		else if( media >= 70.0 ) return "C";
		else if( media >= 60.0 ) return "D";
		else return "F";
	}
}