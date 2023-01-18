import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    private  UserOutput userOutput = new ConsoleUserOutput();

    @Override
    public int read() {
        Scanner scanner = new Scanner(System.in);
        userOutput.print("Ваш ответ: ");
        int x;
        while (!scanner.hasNextInt()) {
            userOutput.print("Ошибка! Введите число");
            scanner.next();
        }
        x = scanner.nextInt();
        return x;
    }
}
