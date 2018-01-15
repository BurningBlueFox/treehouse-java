import java.io.Console;
 
public class Introductions {
  
    public static void main(String[] args) {
        Console console = System.console();
        String name = console.readLine("What is your name?   ");
        console.printf("%S is my name!", name);
        
  }
}