package app.run;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;;

public class FizzBuzz {
	
	/* multiple de 3 -> Fizz
	 * multiple de 5 -> Buzz
	 * multiple de 15 (3 and 5) -> FizzBuzz
	 * */
	public List<Object> doFizzBuzz(int num) {
		
		List<Object> resultat = new ArrayList<Object>();
		
	    resultat = IntStream.rangeClosed(1, num)
	            .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
	            .collect(Collectors.toList());
	           
		return resultat;
	}
	
	/* multiple de 3 ou contenant le chiffre 3 -> Fizz
	 * multiple de 3 ou contenant le chiffre 5 -> Buzz
	 * multiple de 3 et 5 -> FizzBuzz
	 * ==================================================================== 
	 * multiple de 15 (3 and 5)  et contenant le chiffre 3 comme 30 for example
	 * */
	public List<Object> doFizzBuzzNouvelleExigence(int num) {
		
		List<Object> resultat = new ArrayList<Object>();
		
		resultat = IntStream.rangeClosed(1, num)
				.mapToObj(i -> i % 3 == 0 || verifContient3ou5(i)==1 ? (i % 15 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 || verifContient3ou5(i)== 2 ? "Buzz" : i) )
				.collect(Collectors.toList());
		return resultat;
	}
	
	private static int verifContient3ou5(int a) {
		String number = String.valueOf(a);
		
		char[] maliste = number.toCharArray();
		
		for (int i = 0; i < maliste.length; i++) 
        {
            if (maliste[i] == '3')
                return 1;
            else if(maliste[i] == '5')
            	return 2;
        }
		return 0;
	}
}
