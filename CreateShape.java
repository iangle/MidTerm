/**@author Isaac Angle
 * Thios class will create lists of circles, squares, triangles, and 
 * rectangles and allow the GUI class to use them to creates shapes*/
package midterm;

import java.util.ArrayList;
import java.util.List;

public class CreateShape {
	
	private List<Circle> circles = new ArrayList<Circle>();
	private List<Rectangle> rectangles = new ArrayList<Rectangle>();
	private List<Square> squares = new ArrayList<Square>();
	private List<Triangle> triangles = new ArrayList<Triangle>();
	//gets the shapes from the file and puts their information into 4 different lists
	CreateShape(){
		ReadFromFile data = new ReadFromFile();
		for(int i = 0; i < data.getDataType().size(); i++) {
			String shape = data.getDataType().get(i);
			//checks to see what kind of shape that it is and puts it into the
			//correct data structure
			switch(shape) {
			case "\"circle\"":
				circles.add(new Circle(data.getDataType().get(i),data.getIdNum().get(i), data.getFirstSide().get(i),data.getColor_Side().get(i)));
				break;
			case "\"square\"":
				squares.add(new Square(data.getDataType().get(i),data.getIdNum().get(i),data.getFirstSide().get(i),data.getColor_Side().get(i)));
				break;
			case "\"triangle\"":
				triangles.add(new Triangle(data.getDataType().get(i),data.getIdNum().get(i),data.getFirstSide().get(i),data.getColor_Side().get(i),data.getFourthRow().get(i),data.getTriangleColor().get(i)));
				break;
			case "\"rectangle\"":
				rectangles.add(new Rectangle(data.getDataType().get(i),data.getIdNum().get(i),data.getFirstSide().get(i),data.getColor_Side().get(i),data.getFourthRow().get(i)));
				break;
			}
		}
	}

	//returns the array list holding the circles information
	public List<Circle> getCircles() {
		return circles;
	}
	//returns the array list holding the rectangles information
	public List<Rectangle> getRectangles() {
		return rectangles;
	}
	//returns the array list holding the squares information
	public List<Square> getSquares() {
		return squares;
	}
	//returns the array list holding the triangles information
	public List<Triangle> getTriangles() {
		return triangles;
	}

}
