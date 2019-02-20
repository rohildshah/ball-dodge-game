import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main("Main");
	}
	
	
	
	Balls [] ball;
	
	public float hitcounter = 0;
	private int timer = millis();
	private int score;
	
	
	public void settings() {
		size(500,500);
	}
	
	
	
	public void setup() {
		background(0);
		ball = new Balls[10];
		for (int i = 1; i < ball.length; i++) {
			  ball[i] = new Balls(this,250,250,30,random(1,4),random(1,4));
		}
	}
	
	
	
	public void draw() {
		clear();
		for (int i = 1; i < ball.length; i++) {
			  ball[i].paint();
			  ball[i].update();
		}
		
		
		for(int hi = 1; hi < ball.length; hi++) {
			if(dist(mouseX, mouseY, ball[hi].x, ball[hi].y) < 15) {
				hitcounter++;
			}
		}
		
		if(hitcounter > 1) {
			exit();
		}
		if (millis() - timer >= 1000) {
			score = score + 1;
			timer = millis();
		}
		textSize(17);
		fill(255);
		text("Score: " + score, 400, 495);
	}
}
