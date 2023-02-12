
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Bank {
    private Map<Client, List<Account>> clientToAccountsMap;
    private Map<Account, Client> accountToClientMap;



    private Bank(Map<Client, List<Account>> clientToAccountsMap, Map<Account, Client> accountToClientMap) {
        this.clientToAccountsMap = clientToAccountsMap;
        this.accountToClientMap = accountToClientMap;
    }

    private Client findClient(Account account) {
        return accountToClientMap.get(account);
    }


    private List<Account> findAccount(Client client) {
       return clientToAccountsMap.get(client);}


    public static void main(String[] args) {
        Account a1 = new Account(123);
        Account a2 = new Account(1235);
        Account a3 = new Account(3216);
        Account a4 = new Account(456);
        Account a5 = new Account(4545);
        Account a6 = new Account(789);


        List<Account> l1 = new ArrayList<>();
        l1.add(a1);
        l1.add(a2);
        l1.add(a3);
        List<Account> l2 = new ArrayList<>();
        l2.add(a4);
        l2.add(a5);
        List<Account> l3 = new ArrayList<>();
        l3.add(a6);

        Client c1 = new Client("Ivanov", 25, l1);
        Client c4 = new Client("Petrov", 28, l2);
        Client c6 = new Client("Bush", 54, l3);

        Map<Account, Client> accountToClientMap = new HashMap<>();
        accountToClientMap.put(a1, c1);
        accountToClientMap.put(a2, c1);
        accountToClientMap.put(a3, c1);
        accountToClientMap.put(a4, c4);
        accountToClientMap.put(a5, c4);
        accountToClientMap.put(a6, c6);

       Map<Client, List<Account>> clientToAccountsMap = new HashMap<>();
        clientToAccountsMap.put(c1, l1);
        clientToAccountsMap.put(c4, l2);
        clientToAccountsMap.put(c6, l3);

        Client searchClient = new Client("Ivanov", 25, l1);
        Account searchAccount = new Account(456);


        Bank bank = new Bank(clientToAccountsMap, accountToClientMap);
        //bank.findClient(searchAccount);
      // bank.findAccount(searchClient);

        System.out.println("По номеру счета найден " + bank.findClient(searchAccount));
        System.out.println();
        System.out.println("По фамилии клиента найдены аккаунты:" + "\n" + bank.findAccount(searchClient));


    }
}