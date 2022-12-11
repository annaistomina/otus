import java.util.Scanner;

public class GeoTest {

    String question;
    String answers1;
    String answers2;
    String answers3;
    String answers4;
    int correctAnswers;

    public GeoTest(String question, String answers1, String answers2, String answers3, String answers4, int correctAnswers) {

        this.question = question;
        this.answers1 = answers1;
        this.answers2 = answers2;
        this.answers3 = answers3;
        this.answers4 = answers4;
        this.correctAnswers = correctAnswers;
    }

    public static void main(String[] args) {

        // счетчик
        int correctCount = 0, wrongCount = 0;
        class Question {
            String question;
        }
        class Answers {
            String answers1;
            String answers2;
            String answers3;
            String answers4;

        }
        class CorrectAnswers {
            int correctAnswers;
        }

        Question one = new Question();
        one.question = "Какое государство является островным?";

        Answers answersOne = new Answers();
        answersOne.answers1 = "1 Россия";
        answersOne.answers2 = "2 Австралия";
        answersOne.answers3 = "3 Великобритания";
        answersOne.answers4 = "4 Индия";

        CorrectAnswers correctAnswersOne = new CorrectAnswers();
        correctAnswersOne.correctAnswers = 3;

        System.out.println(one.question);
        System.out.println(answersOne.answers1);
        System.out.println(answersOne.answers2);
        System.out.println(answersOne.answers3);
        System.out.println(answersOne.answers4);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваш ответ: ");
        int x;
        while (!scanner.hasNextInt()) {
            System.out.println("Введите число!");
            scanner.next();
        }
        x = scanner.nextInt();
        if (correctAnswersOne.correctAnswers == x) {
            System.out.println("Правильно!");
            correctCount++;
        } else {
            System.out.println("Неправильно");
            wrongCount++;
        }
        System.out.println();

        Question two = new Question();
        two.question = "Самое большое соленое озеро в мире?";

        Answers answersTwo = new Answers();
        answersTwo.answers1 = "1 Каспийское море";
        answersTwo.answers2 = "2 Аральское море";
        answersTwo.answers3 = "3 Мертвое море";
        answersTwo.answers4 = "4 Большое соленое озеро";

        CorrectAnswers correctAnswersTwo = new CorrectAnswers();

        correctAnswersTwo.correctAnswers = 1;

        System.out.println(two.question);
        System.out.println(answersTwo.answers1);
        System.out.println(answersTwo.answers2);
        System.out.println(answersTwo.answers3);
        System.out.println(answersTwo.answers4);
        System.out.println();

        scanner = new Scanner(System.in);
        System.out.print("Ваш ответ: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Введите число!");
            scanner.next();
        }
        x = scanner.nextInt();
        if (correctAnswersTwo.correctAnswers == x) {
            System.out.println("Правильно!");
            correctCount++;
        } else {
            System.out.println("Неправильно");
            wrongCount++;
        }
        System.out.println();

        Question three = new Question();
        three.question = "Столица Турции?";

        Answers answersThree = new Answers();
        answersThree.answers1 = "1 Анталия";
        answersThree.answers2 = "2 Анкара";
        answersThree.answers3 = "3 Стамбул";
        answersThree.answers4 = "4 Измир";

        CorrectAnswers correctAnswersThree = new CorrectAnswers();
        correctAnswersThree.correctAnswers = 2;

        System.out.println(three.question);
        System.out.println(answersThree.answers1);
        System.out.println(answersThree.answers2);
        System.out.println(answersThree.answers3);
        System.out.println(answersThree.answers4);
        System.out.println();

        scanner = new Scanner(System.in);
        System.out.print("Ваш ответ: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Введите число!");
            scanner.next();
        }
        x = scanner.nextInt();
        if (correctAnswersThree.correctAnswers == x) {
            System.out.println("Правильно!");
            correctCount++;
        } else {
            System.out.println("Неправильно");
            wrongCount++;
        }
        System.out.println();
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
