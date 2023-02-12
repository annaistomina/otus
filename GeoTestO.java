import java.util.Scanner;

public class GeoTestO {
    public static void main(String[] args) {

        String[][] questions;
        int correctCount;
        int wrongCount;

        public static void passTest () {
            int i;
            for (i = 0; i < questions.length; i++) {
                for (int j = 0; j < questions[i].length; j++) {
                    System.out.println(questions[i][j]);
                    System.out.println(questions[i][j] + " ");
                }
                System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
            }
        }



        class Question {
            private String[][] questions;
            public Question() {

                questions = new String[][]{
                        {"Какое государство является островным?", "1 Россия", "2 Австралия", "3 Великобритания", "4 Индия"},
                        {"Самое большое соленое озеро в мире?", "1 Каспийское море", "2 Аральское море", "3 Мертвое море", "4 Большое соленое озеро"},
                        {"Столица Турции?", "1 Анталия", "2 Анкара", "3 Стамбул", "4 Измир"},
                };
            }

            public String[][] getQuestions() {
                return questions;
            }

            public void setQuestions(String[][] questions) {
                this.questions = questions;
            }
        }

        class CorrectAnswers {
            private final int[] correctAnswers = {3, 2, 1};

            public CorrectAnswers() {

                int i;
                for (i = 0; i < correctAnswers.length; i++)
                    System.out.print("Ваш ответ:");
                Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt();
                while (!scanner.hasNextInt()) {
                    System.out.println("Ошибка! Введите число.");
                    scanner.next();
                }
                if (x == correctAnswers[i]) {
                    System.out.println("Правильно!");
                    correctCount++;
                } else {
                    System.out.println("Неправильно");
                    wrongCount++;
                }
                System.out.println();

            }

        }

    }
}