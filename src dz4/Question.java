import java.util.Arrays;
import java.util.List;

public class Question {

    public String question;
    public String answers1;
    public String answers2;
    public String answers3;
    public String answers4;
    protected int correctAnswer;

    Question(String question, String answers1, String answers2, String answers3, String answers4, int correctAnswer) {
        this.question = question;
        this.answers1 = answers1;
        this.answers2 = answers2;
        this.answers3 = answers3;
        this.answers4 = answers4;
        this.correctAnswer = correctAnswer;

    }
}