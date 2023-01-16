public class Question {
    private final String crossQuestion;

    private final String[] answers;
    private final int correctAnswer;
    private final UserInput userInput = new ConsoleUserInput();
    private final UserOutput userOutput = new ConsoleUserOutput();

    public Question(String crossQuestion, String[] answers, int correctAnswer) {
        this.crossQuestion = crossQuestion;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public boolean ask() {
        userOutput.print(crossQuestion);
        for (String answer : answers) {
            userOutput.print(answer);
        }
        return correctAnswer == userInput.read();

    }
}