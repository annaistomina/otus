import java.util.*;

public class Client {
      private String name;
      private int age;
    public List<Account>accounts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return age == client.age && name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public String toString() {
        String text = "";
        text += "клиент: " + this.name;
        text += ", возраст: " + this.age;
       // text += ", номер счета:" + this.accounts;
        return text;
    }
    public Client(String name, int age, List<Account>accounts) {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }

}



