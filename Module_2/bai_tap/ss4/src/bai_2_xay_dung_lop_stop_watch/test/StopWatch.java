package bai_2_xay_dung_lop_stop_watch.test;

import java.time.Instant;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = getCurrentTime();
    }

    public void stop() {
        endTime = getCurrentTime();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return 0;
        }
        return endTime - startTime;
    }

    private long getCurrentTime() {
        return Instant.now().toEpochMilli();
    }
}


