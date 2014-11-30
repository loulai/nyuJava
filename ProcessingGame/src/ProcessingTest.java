import processing.core.PApplet;

public class ProcessingTest extends PApplet {	
	//dimensions of the canvas
	int xMax = 600;
	int yMax = 400;
	Disk [] myDisks = new Disk[20] ;
	int iterationCounter = 0;
	int diskCounter = 1;
	
	public void setup() 
	{
		size(xMax,yMax);

		for (int i = 0; i < myDisks.length; i++) 
			myDisks[i] = new Disk(this);
					
	}
	
	public void draw()
	{
		iterationCounter++;
		background (188, 188, 188);
		if (iterationCounter > 100 && diskCounter < myDisks.length ) {
			diskCounter++;
			iterationCounter = 0;
		}
		for (int i = 0; i < diskCounter; i++)
			myDisks[i].move();
	
	}
	
}

//	public void setup() {
//		size(500,500);
//	}
//
//	public void draw() {
//		if(mousePressed){
//			fill(23,200,40);
//		} else {
//	
//			fill(91,20,30);
//		}
//		ellipse(random(0,500), random(0,500),10,10);
//	}
//	
////	public void draw(){
////		triangle(random(0,300),random(0,300),random(0,300),random(0,10),random(0,300),random(0,300));
////	}
//}
