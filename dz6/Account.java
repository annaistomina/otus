import java.util.Objects;

public class Account {
    private int num;
    public Account(int num){
      this.num = num;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return num == account.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    @Override
    public String toString() {
        String text = "";
        text += this.num;
        return text;
    }
}
