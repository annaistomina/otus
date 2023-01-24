import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private ArrayList<Client> clients;
    private UserInputString userInputString = new ConsoleUserInput();
    private UserInputInt userInputInt = new ConsoleUserInput();
    private HashMap<Integer, String> accountAndName;

    Bank(ArrayList<Client> clients, HashMap<Integer, String> accountAndName) {
        this.clients = clients;
        this.accountAndName = accountAndName;
    }


    private void findClient() {
        String a = userInputString.readString();
        Client find;
        for (Client cl : clients) {
            if (a.equals(cl.name)) {
                System.out.println("№ счета: " + cl.account);
            }
        }
    }

    private void findAccount() {
        Account find;
        int b = userInputInt.readInt();
        for (Map.Entry<Integer, String> entry : accountAndName.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (entry.getKey().equals(b)) {
                System.out.println(entry.getValue());
            }
        }
    }

       public static void main(String[] args) {
        Client c1 = new Client("Иванов", 25, 123);
        Client c2 = new Client("Петров", 56, 456);
        Client c3 = new Client("Буш", 65, 789);
        Client c4 = new Client("Иванов", 25, 1235);
        Client c5 = new Client("Иванов", 25, 3216);
        Client c6 = new Client("Петров", 56, 4545);

        ArrayList<Client> clients = new ArrayList<Client>();
        clients.add(c1);
        clients.add(c2);
        clients.add(c3);
        clients.add(c4);
        clients.add(c5);
        clients.add(c6);

        HashMap<Integer, String> accountAndName = new HashMap<>();
        accountAndName.put(123, "Иванов");
        accountAndName.put(1235, "Иванов");
        accountAndName.put(3216, "Иванов");
        accountAndName.put(456, "Петров");
        accountAndName.put(4545, "Петров");
        accountAndName.put(789, "Буш");

        Bank bank = new Bank(clients, accountAndName);

            bank.findAccount();
            bank.findClient();
    }
}