import processing.core.PApplet;

class Balls {
	public float x;
	public float y;
	private float s;
	private float speedx;
	private float speedy;
	PApplet canvas;
	


	public Balls (PApplet np, float newX, float newY, float newSize, float xspeed, float yspeed) {
		x = newX;
		y = newY;
		s = newSize;
		speedx = xspeed;
		speedy = yspeed;
		canvas = np;
	}
	
	
	
	public void update() {
		x = x + speedx;
		y = y + speedy;
		if(x > 485 || x <= 15) {
			speedx = -speedx;
		}
		if(y > 485 || y <= 15) {
			speedy = -speedy;
		}
		
	}


	public void paint() {
		canvas.fill(255,0,0);
		canvas.ellipse(x, y, s, s);
	}
}
