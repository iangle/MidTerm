/**@author Isaac Angle
 * this class will create a GUI for the contents
 * of the other classes. It will allow the user to
 * click on labels and see the detailed specs of a shape
 * as well as a picture representation of that shape*/
package midterm;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Component;

import java.awt.event.MouseAdapter;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Dimension;

import java.awt.Image;


public class ShapeGui {
	private CreateShape shape = new CreateShape();
	private JFrame frame;
	private JLabel shapeLabel;
	private ImageIcon circle,triangle,redSquare,rectangle;
	int x = 50,y = 50;
	int counter = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShapeGui window = new ShapeGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShapeGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//creating the frame that the user sees
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		
		
		try {
			//getting a red square picture from the internet
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			URL imgurl = new URL("https://media.nisbets.com/asset/core/prodimage/largezoom/cg928_y_darkred_square.jpg"); 
			Image img = toolkit.getImage(imgurl);
			img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			redSquare = new ImageIcon(img);
			
			//getting a rectangle from the internet
			Toolkit toolkit2 = Toolkit.getDefaultToolkit();
			URL imgurl2 = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Rectangle_example.svg/1280px-Rectangle_example.svg.png"); 
			Image img2 = toolkit2.getImage(imgurl2);
			img2 = img2.getScaledInstance(100, 50, Image.SCALE_SMOOTH);
			rectangle= new ImageIcon(img2);
			
			//getting a green triangle from the internet
			Toolkit toolkit3 = Toolkit.getDefaultToolkit();
			URL imgurl3 = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Green_equilateral_triangle_point_up.svg/1182px-Green_equilateral_triangle_point_up.svg.png"); 
			Image img3 = toolkit3.getImage(imgurl3);
			img3 = img3.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			triangle = new ImageIcon(img3);
			
			//getting a black circle from the internet
			Toolkit toolkit4 = Toolkit.getDefaultToolkit();
			URL imgurl4 = new URL("https://wallpapersin4k.net/wp-content/uploads/2016/12/Circle-Wallpapers-5.png"); 
			Image img4 = toolkit4.getImage(imgurl4);
			img4 = img4.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			circle = new ImageIcon(img4);
			
		}catch(Exception e){
			e.fillInStackTrace();
		}
		
		//adds a panel to hold the detailed description
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(500, 1000));
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.setLocation(new Point(50, 50));
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		//creates the label that will hold the detailed description
		JLabel lblNewLabel = new JLabel();
		panel.add(lblNewLabel);
		
		//this label with hold the picture of the shape
		shapeLabel  = new JLabel();
		frame.add(shapeLabel);
		
		//circle label with details
		JLabel circ = new JLabel(shape.getCircles().get(0).toString());
		frame.getContentPane().add(circ);
		
		circ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel.setText(shape.getCircles().get(0).getDetailString());
				shapeLabel.setIcon(circle);
			}
		});
		
		//triangles label with details
		JLabel t = new JLabel(shape.getTriangles().get(0).toString());
		frame.getContentPane().add(t);
		
		t.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setText(shape.getTriangles().get(0).getDetailString());
				shapeLabel.setIcon(triangle);
			}
		});
		
		//triangle label with details
		JLabel tri = new JLabel(shape.getTriangles().get(1).toString());
		frame.getContentPane().add(tri);
		
		tri.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setText(shape.getTriangles().get(1).getDetailString());
				shapeLabel.setIcon(triangle);
			}
		});
		
		//square label with details
		JLabel s = new JLabel(shape.getSquares().get(0).toString());
		frame.getContentPane().add(s);
		
		s.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setText(shape.getSquares().get(0).getDetailString());
				shapeLabel.setIcon(redSquare);
			}
		});
		
		//square label with details
		JLabel square = new JLabel(shape.getSquares().get(1).toString());
		square.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setText(shape.getSquares().get(1).getDetailString());
				shapeLabel.setIcon(redSquare);
			}
		});
		
		frame.getContentPane().add(square);
		//rectangle label with details
		JLabel r = new JLabel(shape.getRectangles().get(0).toString());
		frame.getContentPane().add(r);
		
		r.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel.setText(shape.getRectangles().get(0).getDetailString());
				shapeLabel.setIcon(rectangle);
			}
		});
		
		//rectangle label with details
		JLabel rect = new JLabel(shape.getRectangles().get(1).toString());
		frame.getContentPane().add(rect);

		rect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel.setText(shape.getRectangles().get(1).getDetailString());
				shapeLabel.setIcon(rectangle);
			}
		});
		
		//circle label with details
		JLabel c = new JLabel(shape.getCircles().get(1).toString());
		frame.getContentPane().add(c);
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel.setText(shape.getCircles().get(1).getDetailString());
				shapeLabel.setIcon(circle);
			}
		});
		
	}

}
