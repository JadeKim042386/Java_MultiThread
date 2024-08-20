package AccountSystem;

public class User {
    private String name;
    private Account account;

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public Account getAccount() {
        return this.account;
    }

    public String getName() {
        return this.name;
    }
}
