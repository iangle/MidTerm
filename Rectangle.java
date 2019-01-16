/**@author Isaac Angle
 * This class allows for the creation of a Rectangle that has
 * a type, 2 sides and a color associated with it*/
package midterm;

import java.text.DecimalFormat;

public class Rectangle implements Shape{
	String type,idNum,length,width,color;
	private DecimalFormat df = new DecimalFormat("0.00");
	private double sideLength,_Width;
	private double area,perimeter;
	private String a,p;
	public Rectangle(String type,String idNum, String length, String Width,String Color) {
		this.type = type; 
		this.idNum= idNum;
		this.length = length;
		this.width = Width;
		this.color = Color;
		//getting rid of whitespace
		String s = length.trim();
		String d = width.trim();
		//turning the length and width into an int
		sideLength = Integer.parseInt(s);
		_Width = Integer.parseInt(d);
		//getting the area and perimeter
		area = sideLength*_Width;
		perimeter = sideLength*2 + _Width*2;
		//setting it to 2 decimal places
		a = df.format(area);
		p = df.format(perimeter);
		
	}
	//returns the  kind of shape
	@Override
	public String getKind() {
		return type;
	}
	//returns a detailed description of the shape
	@Override
	public String getDetailString() {
		return  "Shape: " + type + " " + "ID: " + idNum + " " + "Length: " + length + " " + "Width: " + width + " " + "Color: " + color + " "
				+ "Area: " + a + " " + "perimeter: " + p + "\n";
	}
	//returns the shapes id number
	@Override
	public String getID() {
		return idNum;
	}
	//returns the shapes name and its id 
	public String toString() {
		return type + " ID(#" + idNum + ")";
	}
}
