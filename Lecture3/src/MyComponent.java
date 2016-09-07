import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	private static final long serialVersionUID = 1L;
	
	static int counter = 0;
	
	public void paintComponent (Graphics g) {
		
		MutableCar car = new MutableCar(getWidth()-60,getHeight()-30, Color.CYAN);
		Random r = new Random();
		
		car.setColor(Color.MAGENTA);
		car.draw(g);
		car.setPosition(r.nextInt(getWidth()-60), r.nextInt(getHeight()-30));
		car.setColor(Color.ORANGE);
		car.draw(g);
		car.setPosition(getWidth()-60, 0);
		car.setColor(Color.CYAN);
		car.draw(g);
		car.setPosition(0, getHeight()-30);
		car.setColor(Color.GREEN);
		car.draw(g);
		car.setPosition(0, 0);
		car.setColor(Color.RED);
		car.draw(g);
		
		System.out.println(counter++);
	}
}
