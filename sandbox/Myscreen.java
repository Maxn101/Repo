
// import swing library
import javax.swing.JFrame;


// declare public class, give it soem functionality from another class; JFrame
public class Myscreen extends JFrame{
//constructor method - runs first when class template is instantiated
public Myscreen(){
	this.setSize(600,400);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	this.setTitle("Yeah");
	
}


public static void main(String[] args){
	Myscreen screen = new Myscreen();
	Mycanvas canvas = new Mycanvas();
	screen.getContentPane().add(canvas);
}
}