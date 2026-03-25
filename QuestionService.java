public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris");
        questions[1] = new Question(2, "What is the capital of Germany?", "Berlin", "London", "Madrid", "Paris", "Berlin");
        questions[2] = new Question(3, "What is the capital of Italy?", "Rome", "London", "Madrid", "Paris", "Rome");
        questions[3] = new Question(4, "What is the capital of Spain?", "Madrid", "London", "Berlin", "Paris", "Madrid");
        questions[4] = new Question(5, "What is the capital of Portugal?", "Lisbon", "London", "Berlin", "Paris", "Lisbon");
    }

    public void displayQuestions() {
        for (Question question : questions) {
            System.out.println(question);
        }
    }
}
