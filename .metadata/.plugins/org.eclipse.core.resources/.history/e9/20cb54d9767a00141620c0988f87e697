import processing.core.PApplet;

public class ProcessingTest extends PApplet {	
	
	int timeCounter = 0;
	Disk[] totalDisks = new Disk[8];
	int score = 0;
	int counter = 0;
	
	public void setup() {
		
		size(800,600);
		background(255);
		
		for(int i = 0; i < 8; i++){
			totalDisks[i] = new Disk(this);
		}
		
	}
	
	public void draw() {
		timeCounter++;
		if (timeCounter < 400) {
			background(100,100,100);
			
			for(int i = 0; i < totalDisks.length; i ++) {
				Disk d = totalDisks[i];
				fill(100,100,100);
				ellipse(d.getX(),d.getY(), d.getRX(),d.getRY());
				d.move();
				
				textSize(20);
				fill(10,0,0);
				textAlign(CENTER);
				text(d.getValue(), d.getX(), d.getY());
				
				if(mousePressed){
					if(mouseX >= (d.getX() - 30) && mouseX <= (d.getX() + 30) && mouseY >= (d.getY() - 30) && mouseY <= (d.getY() + 30)){
						score = score + d.getValue();
						d.setNewCoordinates();
						Disk[] newDisks = new Disk[totalDisks.length - 1];
						
						for (int k = 0; k < totalDisks.length; k++){
							if (i != k){
								newDisks[counter] = totalDisks[k];
								counter++;
							}
						}
						totalDisks = newDisks;
						counter = 0;
					}
				}
				text(score, 70,70);
			}
			
		} else {
			background(100,100,100);
			textSize(50);
			text(score, 400,300);
		}
		
	}
}