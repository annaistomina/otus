
import java.util.Scanner;

public class HomeworkGeoTest {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        // TODO: Массив вопросов (вместо null надо написать определение массива)
        String[] questions = new String[]{"Какое государство является островным?", "Самое большое соленое озеро в мире?", "Столица Турции?"};

        // TODO: Массив вариантов ответов
        String[][] answerOptions = new String[][]{{"1 Россия", "2 Австралия", "3 Великобритания", "4 Индия"}, {"1 Каспийское море", "2 Аральское море", "3 Мертвое море", "4 Большое соленое озеро"}, {"1 Анталия", "2 Анкара", "3 Стамбул", "4 Измир"},};

        // TODO: Массив правильных ответов
        int[] correctAnswers = new int[]{3, 1, 2};

        // Примечание - можете придумать как хранить всю информацию в одном массиве

        Scanner scanner = new Scanner(System.in);
        // TODO: Цикл по всем вопросам - исправить, написать правильно

        for (int i = 0; i < questions.length; i++) {
            // TODO: Вывод вопроса на экран
            System.out.println(questions[i]);

            // TODO: Вывод вариантов ответов на экран

            for (int j = 0; j < answerOptions.length; j++) {
                System.out.println(answerOptions[i][j]);
            }
            System.out.println();

            System.out.print("Ваш ответ: ");
            //TODO: Считываем с консоли ответ пользователя
            int x = scanner.nextInt();
            //TODO: Проверяем ответ и выводим результат

                if (x == correctAnswers[i]) {
                    System.out.println("Правильно!");
                    correctCount++;
                } else {
                    System.out.println("Неправильно");
                    wrongCount++;
                }
            System.out.println();
        }



        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);

    }


}







