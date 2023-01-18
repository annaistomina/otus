public class Question {
    private String crossQuestion;

    private String[] answers;
    private int correctAnswer;
    private UserInput userInput = new ConsoleUserInput();
    private UserOutput userOutput = new ConsoleUserOutput();

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