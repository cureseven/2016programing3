import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Sample1 extends Applet implements ActionListener,MouseListener {
	int x = 10;
	int y = 10;

	public void init()
	{
		addMouseListener(this);
		bt = new Button("Change Color");
		add(bt);
		bt.addActionListener(this);
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
		x = e.getX();
		y = e.getY();repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
	}
	public void paint(Graphics g)
	{
		g.set
		g.fillRect(x, y, 10, 10);
	}
}
