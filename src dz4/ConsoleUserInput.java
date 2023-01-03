import java.util.Scanner;

public class ConsoleUserInput implements UserInput {

    @Override
    public int read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваш ответ: ");
        int x;
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите число");
            scanner.next();
        }
        x = scanner.nextInt();
        return x;
    }
}
