import processing.core.PApplet;
class Disk {
		private float x;
		private float y;
		private float rx;
		private float ry;
		
		private float xSpeed;
		private float ySpeed;
		
		PApplet canvas;

		int col;
		
		public Disk ( PApplet canvas )
		{
			this.canvas = canvas;
			x = canvas.random(0,  canvas.width); 
			y = canvas.random(0, canvas.height);
			rx = canvas.random(5, 25 );
			ry = canvas.random(5, 25 );
			xSpeed = canvas.random(-5, 5 );
			ySpeed = canvas.random(-5, 5 );
			
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
		
}
