package util;

public class Calculator {

    private double soma;        
    private final int n;
	
	public Calculator(int n){
		this.n = n;
	}	

    public double getSoma() {
        return soma;
    }

    public void soma(double valor) {
        soma += valor;
    }

    public double getMedia() {
        return soma / n;
    }
}
