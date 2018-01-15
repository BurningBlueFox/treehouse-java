import java.io.Console;

public class TreeStory{

    public static void main(String[] args) {
        Console console = System.console();

        int age = Integer.parseInt(console.readLine("Enter your age:   "));
        if(age < 13){
            console.printf("\nSorry you are underage\n");
            System.exit(0);
        }
        String name = console.readLine("Enter a name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
        String noun = console.readLine("Enter a noun:  ");
        String adverb = console.readLine("Enter an adverb:  ");
        String verb = console.readLine("Enter a verb ending with -ing:  ");

        console.printf("Your TreeStory:\n--------------------------\n");

        console.printf("%s is a %s %s.   ", name, adjective, noun);
        console.printf("They are always %s %s", adverb, verb);

    }
}