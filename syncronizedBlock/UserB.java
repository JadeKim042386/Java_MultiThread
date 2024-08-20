package syncronizedBlock;

public class UserB extends Thread {
    private Account account;

    public void setAccount(Account account) {
        this.setName("UserB"); // 스레드 이름 설정
        this.account = account;
    }

    @Override
    public void run() {
//        account.setBalance(2000);
        account.setSyncBalance(2000);
    }
}
