import java.util.Arrays;
import java.util.List;
import java.nio.Buffer;

public class MyMain {

	  final static String salutation = "Hello! ";
	   
	   public static void main(String args[]){
	      GreetingService greetService1 = message1 -> 
	      System.out.println(salutation + message1);
	      greetService1.sayMessage("Maheshd");
	      
	      // Second Part
	      String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", 
	    		  "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", 
	    		  "Juan Martin Del Potro"};
	      List<String> players =  Arrays.asList(atp);
	             
	      // Old looping
	      for (String player : players) {
	           System.out.print(player + "; ");
	      }
	             
	      // Using lambda expression and functional operations
	      players.forEach((player) -> System.out.print(player + "; "));
	      
	      
	      // Using double colon operator in Java 8
	      players.forEach(System.out::println);
	      
	      Integer i = 4 ;
	      i= Integer.signum(i);
	      
	   }
		@FunctionalInterface
	   interface GreetingService {
	      void sayMessage(String message);
	   }
	   
	   
}
