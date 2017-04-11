import java.applet.Applet;
import java.awt.Graphics;

public class Sample1 extends Applet{
	int r;
	int x,y;
	double a,b;

	public void paint(Graphics g)
	{

		for(r=0;r<400;r++){

		a=r*(Math.cos(10*r));
		b=r*(Math.sin(10*r));
		g.drawLine((int)a+200,(int)b+200,(int)a+200,(int)b+200);
		}
	}
}