package AccountSystem;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private static Map<String, Account> accounts = new HashMap<>();

    public static void addAccount(String name, Account account) {
        accounts.put(name, account);
    }

    public static synchronized void transaction(String from, String to, long balance) {
        System.out.println("조회");
        Account fromAccount = accounts.get(from);
        Account toAccount = accounts.get(to);

        System.out.println("잔고 계산");
        long fromBalance = fromAccount.getBalance() - balance;
        long toBalance = toAccount.getBalance() + balance;
        System.out.printf("fromBalance: %d, toBalance: %d\n", fromBalance, toBalance);

        sleep();

        System.out.println("잔고 수정");
        fromAccount.setBalance(fromBalance);
        toAccount.setBalance(toBalance);

        System.out.println(from + "의 잔고: " + fromAccount.getBalance());
        System.out.println(to + "의 잔고: " + toAccount.getBalance());
    }

    private static void sleep() {
        try {
            System.out.println("3초간 일시 정지");
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
    }
}
