import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Sample1 extends Applet{
	public void paint(Graphics g)
	{
		g.drawLine(0,200,400,200);
		g.drawLine(200,0,200,400);
		g.drawString("-100", 100, 200);
		g.drawString("100",200,100);
		g.drawString("100", 300, 200);
		g.drawString("-100",200,300);
		int y;
		g.setColor(Color.red);
		for(int x=-200;x<200;x++){
		y=-(x*x/100);
		g.drawLine(200+x, 200+y, 200+x, 200+y);
		}
	}

}
