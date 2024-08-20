package syncronizedBlock;

public class UserA extends Thread {
    private Account account;

    public void setAccount(Account account) {
        this.setName("UserA"); // 스레드 이름 설정
        this.account = account;
    }

    @Override
    public void run() {
//        account.setBalance(1000);
        account.setSyncBalance(1000);
    }
}
