import java.util.Scanner;

public class Prompter{
    private Game game;

    public Prompter(Game game){
        this.game = game;
    }

    public boolean PromptForGuess(){
        Scanner scanner = new Scanner(System.in);
        boolean isHit = false;
        boolean isAcceptable = false;

        do{
            System.out.print("Enter a letter: ");
            String guessInput = scanner.nextLine();
            char guess = guessInput.charAt(0);
            try{
                isHit = game.ApplyGuess(guess);
                isAcceptable = true;
            }catch(IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
        }while(! isAcceptable);

        return isHit;
        
    }

    public void DisplayProgress(){
        System.out.printf("You have %d guesses left.%nTry to solve:  %s%n",
                            game.getRemainingTries(),
                            game.GetCurrentProgress());
    }

    public void DisplayOutcome(){
        if(game.isWon()){
            System.out.printf("You won!!!%nThe answer was %s", game.answer);
        }else{
            System.out.printf("Game over, the answer was %s", game.answer);
        }
    }
}