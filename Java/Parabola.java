public class Parabola{	
	public static void main(String[] args){
		Ball ball = new Ball();
		double x;
		double y;
		for (int i=0; i<=300; i++){
			x = ball.getX();
			y = ball.getY();
			System.out.println(x+"\t"+y);
			ball.next();
		}
	
	}
}
 