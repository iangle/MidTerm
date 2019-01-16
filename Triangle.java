/**@author Isaac Angle
 * This class allows for the creation of a triangle that has
 * a type, three sides and a color associated with it*/
package midterm;

import java.text.DecimalFormat;

public class Triangle implements Shape{
	private String type,idNum,side,otherSide,hypotenuse,color;
	private DecimalFormat df = new DecimalFormat("0.00");
	private double newSide,newOtherSide,newHyp;
	private double area,perimeter;
	private String a,p;
	double height;
	public Triangle(String type,String idNum,String Hypotenuse,String side,String otherSide, String color) {
		this.type = type;
		this.idNum = idNum;
		this.side = side;
		this.otherSide = otherSide;
		this.hypotenuse = Hypotenuse;
		this.color = color;
		
		//getting rid of white space
		String s = this.side.trim();
		String d = this.otherSide.trim();
		String h = this.hypotenuse.trim();
		
		//turning the string into an int
		newSide = Integer.parseInt(s);
		newOtherSide = Integer.parseInt(d);
		newHyp = Integer.parseInt(h);
		
		//getting the area and perimeter
		height = (0.5*newHyp)/newSide;
		area = .5*newHyp*newSide;
		perimeter = newSide+newOtherSide+newHyp;
		
		//making it go to 2 decimal places
		a = df.format(area);
		p = df.format(perimeter);
	}
	//returns the kind of shape
	@Override
	public String getKind() {
		return type;
	}
	//returns a detailed description of the shape
	@Override
	public String getDetailString() {
		return "Shape: " + type + " " + "ID: " + idNum + " " + "side: " + side + " " + "other side: " + otherSide + " " +  "Hypotenuse: " + hypotenuse + " " + "Color: " + color + " "
				+ "Area: " + a + " " + "perimeter: " + p + "\n";
	}
	//returns the shapes ID
	@Override
	public String getID() {
		return idNum;
	}
	//returns the shapes name and its ID
	public String toString() {
		return type + "(ID#" + idNum +")";
	}

}
