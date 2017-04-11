//zxXeK5Df
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Sample1 extends Applet implements ActionListener,MouseListener{
	public void init()
	{
		public void actionPerformed(ActionEvent e) {
			Button bt = new Button("OK");
			add(bt);
			bt.addActionListener(this);
			TextArea ta;
			new TextArea("1",100,100);
		}
	}
	public void mouseClicked(MouseEvent e)
	{
	}
	public void mouseEntered(MouseEvent e)
	{
	}
	public void mouseExited(MouseEvent e)
	{
	}
	public void mousePressed(MouseEvent e)
	{
	}
	public void mouseReleased(MouseEvent e)
	{
	}
	public void paint(Graphics g)
	{
		g.drawLine(0, 200, 400, 200);
		g.drawLine(200, 0, 200, 400);
		g.drawString("-100", 100, 200);
		g.drawString("100",300,200);
		g.drawString("100", 200, 100);
		g.drawString("-100", 200, 300);
		int x=0;
		int y=0;
		y = x;
		for(x=-200;x<200;x++){
			y = -x;
			g.drawOval(x+200, y+200, 1, 1);
		}
	}
