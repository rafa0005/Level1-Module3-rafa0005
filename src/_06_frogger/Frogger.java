package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 600;
	static final int HEIGHT = 400;

	int x = 400;
	int y = 550;
	int hopDistance = 0;
	Car car1, car2, car3, car4;

	public void settings(){
		size(800, 600);
	}

	public void setup(){
		car1 =  new Car(0, 300, 20, 100);
		car2 =  new Car(700, 100, 20, 100);
		car3 =  new Car(0, 500, 20, 100);
		car4 =  new Car(700, 400, 20, 100);
	}

	public void draw(){
		background(0, 0, 255);
		fill(0, 255, 0);
		ellipse(x, y, 50, 50);
		inside();
		car1.display();
		car2.display();
		car3.display();
		car4.display();
		car1.speedLeft();
		car3.speedLeft();
		car2.speedRight();
		car4.speedRight();
	}
	public void keyPressed()
	{
		if(key == CODED){
			if(keyCode == UP)
			{
				y-=30;
			}
			else if(keyCode == DOWN)
			{
				y+=30;
			}
			else if(keyCode == RIGHT)
			{
				x+=30;
			}
			else if(keyCode == LEFT)
			{
				x-=30;
			}
		}
	}
	public void inside(){
		if(x > 800){
			x=800;
		}
		if(x< 0){
			x=0;
		}
		if(y > 600){
			y =600;
		}
		if(y < 0){
			y=0;
		}
	}
	class Car{
		int x;
		int y;
		int speed;
		int size;
		
		
		void display()
		  {
		    fill(0,255,0);
		    rect(x , y,  size, 50);
		  }
		
		public void speedLeft() {
			x-=speed;
			if(x <= -size) {
				x = 800;
			}
		}
		public void speedRight(){
			x+=speed;
			if(x >= 800) {
				x = 0;
			}
		}
		public Car(int x, int y, int speed, int size) {
			this.x = x;
			this.y =y;
			this.speed = speed;
			this.size = size;
			
		}
	}
	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}
}
