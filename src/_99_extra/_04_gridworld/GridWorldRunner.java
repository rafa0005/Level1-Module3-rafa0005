package _99_extra._04_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorldRunner {

	public static void main(String[] args) {
		World planet = new World();
		planet.show();
		Bug beetle = new Bug();
		Location loca = new Location(3, 3);
		planet.add(loca, beetle);
		Bug spider = new Bug();
		Location distance = new Location (7, 7);
		Location north = new Location (7, 8);
		Location west = new Location (8, 7);
		Location south = new Location (7, 6);
		Location east = new Location (6, 7);
		planet.add(distance, spider);
		spider.setColor(Color.blue);
		spider.turn();
		spider.turn();
		Flower rose = new Flower();
		planet.add(north, rose);
		planet.add(west, rose);
		planet.add(south, rose);
		planet.add(east, rose);
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				Location miles = new Location (i, j);
				planet.add(miles, rose);
			}
		}
	}
}
