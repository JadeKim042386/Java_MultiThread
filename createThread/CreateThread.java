package createThread;

public class CreateThread {

    public static Thread anonymousThread() {
        return new Thread() {
            public void run() {
                // 스레드가 실행할 코드
            }
        };
    }
}
