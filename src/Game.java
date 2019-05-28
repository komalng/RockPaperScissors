import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess word:- ");
        String userInput = scanner.next();
        List<String> listOfWords = Arrays.asList("Rock","Paper","Scissors");
        Random random = new Random();
        int randomNumber = random.nextInt(listOfWords.size());
        System.out.println(listOfWords.get(randomNumber));

    }
}
