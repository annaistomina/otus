import java.util.Scanner;

public class ConsoleUserInput implements UserInputInt, UserInputString {
    @Override
    public int readInt() {
        System.out.println("Введите № счета:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (!scanner.hasNextInt()) {
            System.out.println("Попробуйте еще раз");
        }
        return x;
    }


    @Override
    public String readString() {
        System.out.println("Введите фамилию клиента:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
      /*  while (!scanner.hasNextLine()) {
            System.out.println("Ошибка! Введите фамилию клиента");
            scanner.next();
        }*/
        return str;
    }
}

