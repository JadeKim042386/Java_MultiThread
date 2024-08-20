package threadGroup;

public class ThreadGroupExample {
    public static void main(String[] args) {
        // main 스레드 그룹의 하위 스레드 그룹으로 생성
        ThreadGroup myGroup = new ThreadGroup("myGroup");

        // myGroup에 두 스레드를 포함시킴
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
        myGroup.interrupt();
    }
}
