import java.util.ArrayList;
import java.util.List;

public class GeoTest {
    public static void main(String[] args) {        int correctCount = 0;
        int wrongCount = 0;

        Question block1 = new Question
                ("Какое государство является островным?",
                        "1 Россия",
                        "2 Австралия",
                        "3 Великобритания",
                        "4 Индия",
                        3);

        Question block2 = new Question("Самое большое соленое озеро в мире?",
                "1 Каспийское море",
                "2 Аральское море",
                "3 Мертвое море",
                "4 Большое соленое озеро",
                1);
        Question block3 = new Question("Столица Турции?",
                "1 Анталия",
                "2 Анкара",
                "3 Стамбул",
                "4 Измир",
                2);

        List<Question> questions = new ArrayList<Question>();
        questions.add(block1);
        questions.add(block2);
        questions.add(block3);
        BlockTest blockTest = new BlockTest(questions);
        List<Question> bks = blockTest.getAllBlocks();
       for (Question qs : bks) {
           System.out.println(qs.question);
           System.out.println(qs.answers1);
           System.out.println(qs.answers2);
           System.out.println(qs.answers3);
           System.out.println(qs.answers4);
           System.out.println();

           ConsoleUserInput consoleUserInput = new ConsoleUserInput();
           if (qs.correctAnswer == consoleUserInput.read()) {
               correctCount++;
           } else {
               wrongCount++;
           }
           System.out.println();
    }

            System.out.println();

            System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
        }
    }













