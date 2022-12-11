
import java.util.Scanner;

public class HomeworkGeoTest2 {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String[] questions = new String[]{"Какое государство является островным?", "Самое большое соленое озеро в мире?", "Столица Турции?"};
        String[][] answerOptions = new String[][]{{"1 Россия", "2 Австралия", "3 Великобритания", "4 Индия"}, {"1 Каспийское море", "2 Аральское море", "3 Мертвое море", "4 Большое соленое озеро"}, {"1 Анталия", "2 Анкара", "3 Стамбул", "4 Измир"},};
        int[] correctAnswers = new int[]{3, 1, 2};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
                        System.out.println(questions[i]);
                        for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(answerOptions[i][j]);
            }
            System.out.println();
                        System.out.print("Ваш ответ: ");
            int x;
            while (!scanner.hasNextInt()) {
                System.out.println("Введите число!");
                scanner.next();
            }
            x = scanner.nextInt();
            if (x == correctAnswers[i]) {
                System.out.println("Правильно!");
                correctCount++;
            } else {
                System.out.println("Неправильно");
                wrongCount++;
            }
            System.out.println();
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}







