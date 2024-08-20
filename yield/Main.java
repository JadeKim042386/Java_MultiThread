package yield;

public class Main {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        // threadA, threadB 모두 실행
        threadA.start();
        threadB.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        threadA.work = false;  // threadB만 실행

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        threadA.work = true;  // threadA, threadB 모두 실행

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        // threadA, threadB 모두 종료
        threadA.stop = true;
        threadB.stop = true;
    }
}
