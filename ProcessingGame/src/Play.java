import processing.core.PApplet;

public class Play extends PApplet {
	int i = 0;
	public void setup() {
		size(200,200);
		background(255);
		smooth();
		strokeWeight(15);
		frameRate(24);
	}
	
	public void draw(){
		stroke(random(50), random(255), random(255), 100);
		line( i, 0, random(0, width), height);
		if (i &lt; width){
			i++;
		} else {
			i = 0
		}
	}
}
