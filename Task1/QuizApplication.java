package Task1;
import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "What is the capital of France?",
                "Which planet is known as the Red Planet?",
                "Who developed the theory of relativity?"
        };

        String[][] options = {
                {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
                {"1. Earth", "2. Mars", "3. Venus", "4. Jupiter"},
                {"1. Isaac Newton", "2. Albert Einstein", "3. Nikola Tesla", "4. Galileo"}
        };

        int[] correctAnswers = {3, 2, 2}; // Correct answer indices (1-based)
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            if (answer == correctAnswers[i]) {
                score++;
            }
        }

        System.out.println("Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
