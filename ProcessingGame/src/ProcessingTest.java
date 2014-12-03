import processing.core.PApplet;

public class ProcessingTest extends PApplet {	
	
	int timeCounter = 0;
	Disk[] totalDisks = new Disk[5];
	int score = 0;
	int counter = 0;
	int printCounter = 0;
	
	public void setup() {
		
		size(800,600);
		background(255);
		
		for(int i = 0; i < 5; i++){
			totalDisks[i] = new Disk(this);
		}
		
	}
	
	long startTime = System.currentTimeMillis();
	public void draw() {
		if (timeCounter < 1000) {
			
			background(100,100,100);	
			
			for(int i = 0; i < totalDisks.length; i ++) {
				Disk d = totalDisks[i];
				
				fill(100,100,100);
				d.move();
				
				textSize(20);
				fill(10,0,0);
				textAlign(CENTER);
				text(d.getValue(), d.getX(), d.getY());
				
				
				if(timeSince(startTime) > 2000 && printCounter == 0 && startTime % 1000){
					printCounter ++;
					System.out.println("hello");
				}
				
				
//				boolean again = true;
//	
//				if(timeSince(startTime) % 1000 < 5) {
//					if(again == true){
//						again = false;
//						System.out.println(timeSince(startTime));
//					}
//				}
				
			
				
//				if(timeCounter != 0 && timeCounter % 100 == 0){
//					System.out.println("Removing Disk at " + timeCounter);
//					Disk[] leftovers = new Disk[totalDisks.length - 1];
//					
//					for(int h = 0; h < totalDisks.length - 1; h++){
//						leftovers[h] = totalDisks[h];
//	
//					}
//					totalDisks = leftovers;
//				}
				
				if(mousePressed){
					if(mouseX >= (d.getX() - 30) && mouseX <= (d.getX() + 30) && mouseY >= (d.getY() - 30) && mouseY <= (d.getY() + 30)){
						score = score + d.getValue();
						
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
			timeCounter+=1;
			
		} else {
			background(100,100,100);
			textSize(50);
			text(score, 400,300);
		}
		
	}

	public static int timeSince(long startTime){
		long currentTime = System.currentTimeMillis();
		return (int)(currentTime - startTime);
	}
}