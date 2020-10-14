package app.run;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		FizzBuzz game = new FizzBuzz();
		
		//List<Object> doFizz = game.doFizzBuzz(100);
		//doFizz.forEach(System.out::println);
		
		List<Object> doFizzNouvelleExigence = game.doFizzBuzzNouvelleExigence(100);
		
		doFizzNouvelleExigence.forEach(System.out::println);
	}
	
}
