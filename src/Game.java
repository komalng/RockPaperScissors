import java.util.*;

public class Game {
    public static void main(String[] args) {
        while(true) {
            String userInput = getInput();
            List<String> listOfWords = Arrays.asList("Rock", "Paper", "Scissors");
            Random random = new Random();
            int randomNumber = random.nextInt(listOfWords.size());
            String computerChoice = listOfWords.get(randomNumber);

            if (computerChoice.equalsIgnoreCase(userInput)) {
                System.out.println("Draw");
            } else if (!computerChoice.equalsIgnoreCase(userInput))
                if (computerChoice.equalsIgnoreCase("rock") && userInput.equalsIgnoreCase("paper")) {
                    System.out.println("Win");
                } else if (computerChoice.equalsIgnoreCase("Scissors") && userInput.equalsIgnoreCase("Rock")) {
                    System.out.println("Win");
                } else if (computerChoice.equalsIgnoreCase("paper") && userInput.equalsIgnoreCase("Scissors")) {
                    System.out.println("Win");
                } else {
                    System.out.println("lose");
                }

            String playAgain = getPlayAgain();
            if("yes".equalsIgnoreCase(playAgain)){
                break;
            }
        }
    }
    public static  String getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess word:- ");
        return scanner.next();
    }
    public static String getPlayAgain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do You want to exit");
        return scanner.next();
    }
}
