import processing.core.PApplet;
class Disk {
		private float x;
		private float y;
		private float rx;
		private float ry;
		
		private float xSpeed;
		private float ySpeed;
		
		private int value;
		
		PApplet canvas;

		int col;
		
		public Disk ( PApplet canvas )
		{
			this.canvas = canvas;
			x = canvas.random(0, canvas.width); 
			y = canvas.random(0, canvas.height);
			rx = 60;
			ry = 60;
			xSpeed = canvas.random(-10, 10 );
			ySpeed = canvas.random(-10, 10 );
			
			int valueChooser = (int)((Math.random() * 4) + 1);
			
			if(valueChooser == 1) value = 10;
			else if (valueChooser == 2) value = 20;
			else if (valueChooser == 3) value = 50;
			else if (valueChooser == 4) value = 100;
			
			col = canvas.color(canvas.random(0,255), canvas.random(0,255), canvas.random(0,255));
		}
		
		public void move() {
			// update position based on speed
			x += xSpeed;
			y += ySpeed;
			// bouncing logic - see if the ball hits any of the edges
			// note how we are referring to the width and height
			// instance vars on the PApplet object

			if (x > canvas.width) {
				x = canvas.width;
				xSpeed *= -1;
				changeShape ();
			}
			if (x < 0) {
				x = 0;
				xSpeed *= -1;
				changeShape ();
			}
			if (y > canvas.height) {
				y = canvas.height;
				ySpeed *= -1;
				changeShape ();
			}
			if (y < 0) {
				y = 0;
				ySpeed *= -1;
				changeShape ();
			}
			// call the ellipse method on the PApplet object to draw
			// this object to the canvas
			canvas.fill(col);
			this.canvas.ellipse(x, y, rx, ry);
		}
		
		private void changeShape () {
			float tmp = rx;
			rx = ry;
			ry = tmp;
		}
		
		public float getX() {
			return x;
		}
		
		public float getY() {
			return y;
		}
		
		public float getRX() {
			return rx;
		}
		
		public float getRY(){
			return ry;
		}
		
		public int getValue() {
			return value;
		}
		
		public void setNewCoordinates() {
			x = (int)(Math.random()*301);
			y = (int)(Math.random()*301);
		}
		
}
