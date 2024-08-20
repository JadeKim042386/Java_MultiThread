package wait_notify;

public class DataBox {
    private String data;

    public synchronized String getData() {
        // data가 null이면 소비자 스레드를 일시 정지 상태로 만듬
        if (this.data == null) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        String returnValue = this.data;
        System.out.println("ConsumerThread가 읽은 데이터: " + returnValue);
        // data를 null로 만들고 생산자 스레드를 실행 대기 상태로 만듬
        data = null;
        notify();
        return returnValue;
    }

    public synchronized void setData(String data) {
        // data가 null이 아니면 생산자 스레드를 일시 정지 상태로 만듬
        if (this.data != null) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        this.data = data;
        System.out.println("ProducerThread가 생성한 데이터: " + data);
        notify();
    }
}
