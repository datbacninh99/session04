package BT3;
public class StopWatch {
    // Khai báo các trường startTime và endTime
    private long startTime;
    private long endTime;

    // Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Phương thức getter trả về giá trị của startTime
    public long getStartTime() {
        return startTime;
    }

    // Phương thức setter thiết lập giá trị cho startTime
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    // Phương thức getter trả về giá trị của endTime
    public long getEndTime() {
        return endTime;
    }

    // Phương thức setter thiết lập giá trị cho endTime
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    // Phương thức start() để reset startTime về thời gian hiện tại của hệ thống
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Phương thức end() để thiết lập endTime về thời gian hiện tại của hệ thống
    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    // Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond
    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }
}