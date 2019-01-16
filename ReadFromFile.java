/**@author Isaac Angle
 * this class will read from the file and will stick
 * important information into several data structure for use
 * in the interfaceShap class*/
package midterm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {
	private String[] parse;
	//arraylists containing the 5 fives of the excel file
	private List<String> dataType = new ArrayList<String>();
	private List<String> IdNum = new ArrayList<String>();
	private List<String> firstSide = new ArrayList<String>();
	private List<String> color_Side = new ArrayList<String>();
	private List<String> fourthRow = new ArrayList<String>();
	private List<String> triangleColor = new ArrayList<String>();
	
	private String line = "";
	private BufferedReader r = null;
	private String csvFile = "C:\\Users\\iangle22\\Desktop\\fileReading\\shapes.csv";
	//split the excel file by commas
	private String csvSplitBy = ",";
	
	ReadFromFile(){
		//reads content from the file and puts it into categories
		try {
			r = new BufferedReader(new FileReader(csvFile));
			while((line = r.readLine()) != null) {
					parse = line.split(csvSplitBy);
					dataType.add(parse[0]);
					IdNum.add(parse[1]);
					firstSide.add(parse[2]);
					color_Side.add(parse[3]);
					//making sure the indexes match up
					if(parse[0].equals("\"triangle\"") || parse[0].equals("\"rectangle\"")) {
						fourthRow.add(parse[4]);
					} else {
						fourthRow.add("Empty String");
					}
					//making sure the indexes match up
					if(parse[0].equals("\"triangle\"")) {
						triangleColor.add(parse[5]);
					} else {
						triangleColor.add("Empty String");
					}
			}
			
		} catch(Exception e) {
			System.out.println("Could not read file");
		}
	}
	//returns the type of shape e.g. square
	public List<String> getDataType() {
		return dataType;
	}
	//returns the idnumber associated with the shape
	public List<String> getIdNum() {
		return IdNum;
	}
	//returns the first side listed in the file
	public List<String> getFirstSide() {
		return firstSide;
	}
	//returns either a color or a shapes side length
	public List<String> getColor_Side() {
		return color_Side;
	}
	//returns the fourth row of the file
	public List<String> getFourthRow() {
		return fourthRow;
	}
	//returns the color of the triangle
	public List<String> getTriangleColor() {
		return triangleColor;
	}
}
