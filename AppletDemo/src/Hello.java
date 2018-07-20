import java.applet.Applet;
import java.awt.Graphics;

public class Hello extends Applet{
	@Override
	public void init() {
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("hello world", 30, 30);
		
	
	}
}
