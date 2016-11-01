import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import sun.audio.*;

public class Mycanvas extends Canvas implements KeyListener, MouseListener {
	
	Image img = Toolkit.getDefaultToolkit().getImage("ZedChibi.png");
	
	int x = 10;
	int y = 10;

	Rectangle rect = new Rectangle(400,100,250,250);

	public Mycanvas(){
		this.setSize(800,600);
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.repaint();
		this.setFocusable(true);
		PlayIt("Ignite.wav");
	}
	public void paint(Graphics g){
		
		g.drawImage(img,x,y,300,250,this);
		g.fillRect((int)rect.getX(),(int)rect.getY(),(int)rect.getWidth(),(int)rect.getHeight());

	}






	

	public static void PlayIt(String filename) {
		try {
			InputStream in = new FileInputStream(filename);
			AudioStream as = new AudioStream(in);
			AudioPlayer.player.start(as);
			}catch (IOException e) {
			System.out.println("can not find file");
			}
		

	}
//clicks
	public void	mouseClicked(MouseEvent e){
		x = e.getX();
		y = e.getY();
		this.repaint();
		PlayIt("Project.wav");
		
	}

	public void	mouseEntered(MouseEvent e){

	}

	public void	mouseExited(MouseEvent e){

	}

	public void	mousePressed(MouseEvent e){
		

	}

	public void	mouseReleased(MouseEvent e){

	}

//keys
	
	public void keyPressed(KeyEvent e){
		
		if (x > 500) {
			x = x - 20;
		}
		if (y > 300) {
			y = y - 20;
		
		}
		if (x < 0) {
			x = x + 20;
		}
		if (y < 0) {
			y = y + 20;
		this.repaint();
		}
		if (e.getKeyCode() == 39){
			x = x + 5;
		} else if (e.getKeyCode() == 37){
			x = x - 5;
		} else if (e.getKeyCode() == 40){
			y = y + 5;
		} else if (e.getKeyCode() == 38){
			y = y - 5;
		}
		this.repaint();
		if (rect.contains(x,y)) {
			x = 50;
			y = 30;
			this.repaint();
			return;
		}
		
		

	} 

	
	public void keyReleased(KeyEvent e){
		
	}
	
	public void keyTyped(KeyEvent e){
		
	}

	
 
}

