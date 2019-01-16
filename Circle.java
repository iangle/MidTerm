/**@author Isaac Angle
 * This class allows for the creation of a circle that has
 * a type, a radius and a color associated with it*/
package midterm;

import java.text.DecimalFormat;

public class Circle implements Shape{
	
	private String type,idNum,radius,color;
	private static double PI = 3.14;
	private int r;
	double _area;
	double _surfaceArea;
	private DecimalFormat df = new DecimalFormat("00.00");
	private String area;
	private String surfaceArea;
	
	public Circle(String type,String idNum, String radius, String color) {
		this.type = type;
		this.idNum = idNum;
		this.radius = radius;
		this.color = color;
		//getting rid of white space
		String s = radius.trim();
		//making it into an int
		r = Integer.parseInt(s);
		//getting the area and surface area
		_area = r*PI*r;
		area = df.format(_area);
		_surfaceArea =4*PI*r*r;
		surfaceArea = df.format(_surfaceArea);
	}
	//returns the kind of shape
	@Override
	public String getKind() {
		return type;
	}
	//returns a detailed description of the shape
	@Override
	public String getDetailString() {
		return "Shape: " + type + " " + "ID: " + idNum + " " + "Radius: " + radius + " " + "Color: " + color + " "
				+ "Area: " + area + " " + "Surface Area: " + surfaceArea + "\n";
	}
	//returns the id of the shape
	@Override
	public String getID() {
		return idNum;
	}
	//returns the shapes kind and id together
	public String toString() {
		return type + "(ID#" + idNum + ")";
	}
}
