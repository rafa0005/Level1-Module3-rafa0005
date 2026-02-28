package _04_netflix;

import javax.swing.JOptionPane;

public class NETFLIX1 {

	public static void main(String[] args) {
		Movie spidermanAcrossTheSpiderverse = new Movie("SpidermanAcrossTheSpiderverse", 3);
		Movie spidermanIntoTheSpiderverse = new Movie("SpidermanIntoTheSpiderverse", 5);
		Movie kpopDemonHunters = new Movie("KpopDemonHunters", 1);
		Movie theWildRobot = new Movie("The Wild Robot", 4);
		Movie squidGame = new Movie("SquidGame", 3);
		
		System.out.println(spidermanAcrossTheSpiderverse.getTicketPrice());
		
		spidermanIntoTheSpiderverse.getTicketPrice();
		theWildRobot.getTicketPrice();
		kpopDemonHunters.getTicketPrice();
		squidGame.getTicketPrice();
		
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(squidGame);
		netflix.addMovie(theWildRobot);
		netflix.addMovie(kpopDemonHunters);
		netflix.addMovie(spidermanIntoTheSpiderverse);
		netflix.addMovie(spidermanAcrossTheSpiderverse);
		
		netflix.printMovies();
		netflix.sortMoviesByRating();
		
		JOptionPane.showMessageDialog(null, "the best movie is " + netflix.getBestMovie());
		JOptionPane.showMessageDialog(null, "the  second best movie is " + netflix.getMovie(1));
	}
}
