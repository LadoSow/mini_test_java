package app.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import app.run.FizzBuzz;

class FizzBuzzTest {

	@Test
	void testPositiveParameter() {
		
		int num = 100;
		FizzBuzz game = new FizzBuzz();
		List<Object> doFizzBuzz = game.doFizzBuzz(num);
		
		//Test
		assertTrue("Parametre Positif", num == doFizzBuzz.size());
	}
	
	@Test
	void testNegativeParameter() {
		int num = -100;
		FizzBuzz game = new FizzBuzz();
		List<Object> doFizzBuzz = game.doFizzBuzz(num);
		
		//Test
		assertTrue("Parametre Negatif", num == doFizzBuzz.size());
	}
	
	@Test
	void testValidParameter() {
		int num = 5;
		FizzBuzz game = new FizzBuzz();
		List<Object> doFizzBuzz = game.doFizzBuzz(num);
		
		//Test
		assertTrue("Parametre requis(100) non renseigné", doFizzBuzz.size() == 100);
	}
			
	@Test
	void verificationFizzBuzz() throws Exception{
		//test le bon fonctionnement de fizzbuzz sur 20 elements
		int num = 100;
		
		List<Object> verificationList = Arrays.asList(1,2,"Fizz",4,"Buzz","Fizz",7,8,"Fizz","Buzz",
				11,"Fizz",13,14,"FizzBuzz",16,17,"Fizz",19,"Buzz");
		
		FizzBuzz game = new FizzBuzz();
		
		List<Object> doFizzBuzz = game.doFizzBuzz(num).subList(0, 20);
		
		assertEquals(verificationList,doFizzBuzz, "Programme n'est pas juste");
					
	}
	
	@Test
	void verificationFizzBuzzNouvelleExigence(){
		//test le bon fonctionnement de fizzbuzz sur 20 elements
		int num = 100;
		
		List<Object> verificationList = Arrays.asList(1,2,"Fizz",4,"Buzz","Fizz",7,8,"Fizz","Buzz",
				11,"Fizz","Fizz",14,"FizzBuzz",16,17,"Fizz",19,"Buzz");
		
		FizzBuzz game = new FizzBuzz();
		
		
		List<Object> doFizzBuzz = game.doFizzBuzzNouvelleExigence(num).subList(0, 20);
		
		assertEquals(verificationList,doFizzBuzz, "Programme n'est pas juste");
					
	}
}
