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
        System.out.println(crossQuestion);
        for (int i = 0; i < answers.length; i++) {
            userOutput.print(answers[i]);
        }
        //userOutput.print();

        if (correctAnswer == userInput.read()) {
            return true;
        } else {
            return false;
        }

    }
}