import java.util.Random;
public class Ball{
	private double x;
	private double y;
	private double dx;
	private double dy;
	Random rnd = new Random();
	public Ball(){
		x = 0.0;
		y = 0.0;
		dx = rnd.nextInt(401)-200;
		dy = rnd.nextInt(201)+200;	
	}
	public double getX(){
		return x;
	}	
	public double getY(){
		return y;
	}	
	public void next(){
		x = x + dx;
		y = y + dy;
		dy -= 9.8;
		if (y < 0){
			x = 0.0;
			y = 0.0;
			dx = rnd.nextInt(401)-200;
			dy = rnd.nextInt(201)+200;
		}
	}




}
 