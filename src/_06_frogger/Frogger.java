package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
	static final int WIDTH = 600;
	static final int HEIGHT = 400;

	int x = 400;
	int y = 549;
	PImage back;
	 PImage carLeft;
	 PImage carRight;
	 PImage frog;
	int hopDistance = 0;
	Car car1, car2, car3, car4;
	boolean intersects(Car car) {
		if(y+25< car.getY()||
		y-25>car.getY()+ 50 ||
		x+25 < car.getX() ||
		x-25 > car.getX()+ car.getSize()
	) { return false;
	}
		else {
			return true;
		}
		
		
	}
	
	public void settings(){
		size(800, 600);
	}

	public void setup(){
		 back = loadImage("src/_06_frogger/froggerBackground.png");
		 back.resize(800, 600);
		 carLeft = loadImage("src/_06_frogger/carLeft.png");
		 carLeft.resize(100, 50);
		 carRight = loadImage("src/_06_frogger/carRight.png");
	        carRight.resize(100, 50);
		car1 =  new Car(0, 301, 20, 100, false);
		car2 =  new Car(700, 102, 20, 100, true);
		car3 =  new Car(0, 498, 20, 100, false);
		car4 =  new Car(700, 402, 20, 100, true);
	}

	public void draw(){
		background(back);
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
		boolean cross = intersects(car1);
		if(cross == true) {
			x = 400;
			y = 550;
		}
		 cross = intersects(car2);
		if(cross == true) {
			x = 400;
			y = 550;
		}
		cross = intersects(car3);
		if(cross == true) {
			x = 400;
			y = 550;
		}
		 cross = intersects(car4);
		if(cross == true) {
			x = 400;
			y = 550;
		}
	}
	
	public void keyReleased()
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
		boolean right;
		
		int x;
		int y;
		int speed;
		int size;
		int getSize() {
			return size;
		}
		int getX() {
			return x;
		}
		int getY() {
			return y;
		}
		void display()
		  {
		    fill(0,255,0);
		   
		    if(right == true ) {
		    	image(carRight, x, y);
		    }
		    else {
		    	image(carLeft, x, y);
		    }
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
		public Car(int x, int y, int speed, int size, boolean right) {
			this.x = x;
			this.y =y;
			this.speed = speed;
			this.size = size;
			this.right = right;
		}
	}
	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}
}
