package syncronizedBlock;

public class Account {
    private long balance;

    public long getBalance() {
        return this.balance;
    }

    public void setBalance(long balance) {
        synchronized (this) { // this -> 잠금 대상
            this.balance = balance;
            try {
                Thread.sleep(2000); // 2초간 일시 정지
            } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + ": " + this.balance);
        }
    }

    public synchronized void setSyncBalance(long balance) {
        this.balance = balance;
        try {
            Thread.sleep(2000); // 2초간 일시 정지
        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + this.balance);
    }
}
