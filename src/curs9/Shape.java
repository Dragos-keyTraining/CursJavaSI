package curs9;

public class Shape {

	public String shapeName = "generic shape";
	public String shapeColor = "genric color";
	
	
	public Shape(String name, String color) {
		this.shapeName =  name;
		this.shapeColor = color;
		
	}
	
	public Shape() {}
	
	
	public void displayDetails() {
		System.out.println("CLASA PARINTE : Shape name is : " + shapeName + " and the color is :"+ shapeColor);
	}
	
	
}
