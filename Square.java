/**@author Isaac Angle
 * This class allows for the creation of a Square that has
 * a type, 1 side length and a color associated with it*/
package midterm;

import java.text.DecimalFormat;

public class Square implements Shape{
	private String type,idNum,SideLength,color;
	private int length;
	private double area, perimeter;
	private DecimalFormat df = new DecimalFormat("00.00");
	private String newArea,newPer;
	public Square(String type, String idNum, String SideLength, String color) {
		this.type = type;
		this.idNum = idNum;
		this.SideLength = SideLength;
		this.color = color;
		
		//computing the area and perimeter of the square
		String s = SideLength.trim();
		length = Integer.parseInt(s);
		area = length*length;
		perimeter = length*4;
		newArea = df.format(area);
		newPer = df.format(perimeter);
		
	}
	//returns the kind of shape
	@Override
	public String getKind() {
		return type;
	}
	//returns a detailed description of the shape
	@Override
	public String getDetailString() {
		return  "Shape: " + type + " " + "ID: " + idNum + " " + "side Length: " + SideLength + " " + "Color: " + color + "  "
				+ "Area: " + newArea + " " + "perimeter: " + newPer + "\n";
	}
	//returns the shapes id
	@Override
	public String getID() {
		return idNum;
	}
	//returns the shapes kind and id together 
	public String toString() {
		return type + "(ID#" + idNum +")";
	}
}
