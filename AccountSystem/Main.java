package AccountSystem;

public class Main {

    public static void main(String[] args) {
        Account accountA = new Account();
        accountA.setBalance(1000);
        Account accountB = new Account();
        accountB.setBalance(1000);
        Bank.addAccount("userA", accountA);
        Bank.addAccount("userB", accountB);
        User userA = new User("userA", accountA);
        User userB = new User("userB", accountB);

        // A -> B
        System.out.println("A -> B");
        Thread threadA = new Thread(() -> Bank.transaction(userA.getName(), userB.getName(), 1000));

        // B -> A
        System.out.println("B -> A");
        Thread threadB = new Thread(() -> Bank.transaction(userB.getName(), userA.getName(), 1000));

        threadA.start();
        threadB.start();
    }
}
