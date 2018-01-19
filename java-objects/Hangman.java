class Hangman{
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Usage: java Hangman <answer>\n answer is required");
            System.exit(1);
        }
        Game game = new Game(args[0]);
        Prompter prompter = new Prompter(game);
        while(game.getRemainingTries() > 0 && !game.isWon()){
            prompter.DisplayProgress();
            prompter.PromptForGuess();
        }

        prompter.DisplayOutcome();


    }
}