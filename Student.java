package Entities;

public class Student {

    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public Student(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
      
    public double calculaMedia() {
        return media = (nota1 + nota2) / 2.0;
    }
    
    public double setMedia(){
    	return media;
    }

	public String getNome() {
		return nome;
	}
    
}
