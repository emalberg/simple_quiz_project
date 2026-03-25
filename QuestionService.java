import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris");
        questions[1] = new Question(2, "What is the capital of Germany?", "Berlin", "London", "Madrid", "Paris", "Berlin");
        questions[2] = new Question(3, "What is the capital of Italy?", "Rome", "London", "Madrid", "Paris", "Rome");
        questions[3] = new Question(4, "What is the capital of Spain?", "Madrid", "London", "Berlin", "Paris", "Madrid");
        questions[4] = new Question(5, "What is the capital of Portugal?", "Lisbon", "London", "Berlin", "Paris", "Lisbon");
    }

    public void playQuiz() {
        int i = 0;
        for (Question question : questions) {
            System.out.println("Question Number: " + question.getId());
            System.out.println("Question: " + question.getQuestion());
            System.out.println("Options: ");
            System.out.println("1. " + question.getOption1());
            System.out.println("2. " + question.getOption2());
            System.out.println("3. " + question.getOption3());
            System.out.println("4. " + question.getOption4());
            System.out.println("--------------------------------");
            Scanner scanner = new Scanner(System.in);
            selection[i] = scanner.nextLine();
            i++;
        }
        for (String selection : selection) {
            System.out.println(selection);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < selection.length; i++) {
            Question question = questions[i];
            String correctAnswer = question.getAnswer();
            String userAnswer = selection[i];
            if (correctAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }
}
