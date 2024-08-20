package syncronizedBlock;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        UserA userA = new UserA();
        userA.setAccount(account);
        userA.start();

        UserB userB = new UserB();
        userB.setAccount(account);
        userB.start();

        // <<동기화 블록을 적용하지 않을 경우>>
        // 1. UserA가 1000으로 수정
        // 2. UserA가 2초간 일시정지하여 출력하기 전, UserB가 2000으로 수정
        // 3. UserA가 출력하면 UserB가 수정한 값 2000이 나옴
    }
}
