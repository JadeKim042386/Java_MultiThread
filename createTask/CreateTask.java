package createTask;

public class CreateTask {
    /**
     * Runnable 익명 객체
     */
    public static Runnable anonymousTask() {
        return new Runnable() {
            @Override
            public void run() {
                // 스레드가 실행할 코드
            }
        };
    }

    /**
     * 람다식
     */
    public static Runnable lambdaTask() {
        return () -> {
            // 스레드가 실행할 코드
        };
    }
}
