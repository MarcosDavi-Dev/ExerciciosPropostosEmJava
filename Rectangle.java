package entities;

public class Rectangle {
	
	public static double width;
	public static double height;
	
	public static double Area(){
		return width * height;
	}
	
	public static double Perimeter(){
		return 2*(width+height);
	}
	
	public static double Diagonal(){
		return Math.sqrt(Math.pow(width, 2.00)+Math.pow(height, 2.00));
	}
	
	public String toString(){
		return "AREA = " + 
	String.format("%.2f", Area()) + 
	"; PERIMETER = " + 
	String.format("%.2f", Perimeter()) + 
	"; DIAGONAL = " + String.format("%.2f",Diagonal());
	}
	
}
