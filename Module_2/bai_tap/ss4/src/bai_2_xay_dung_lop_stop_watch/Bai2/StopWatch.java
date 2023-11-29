package bai_2_xay_dung_lop_stop_watch.Bai2;

import java.time.Instant;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }
    //thoi gian hien tai
    private long getCurrentTime() {
        return Instant.now().toEpochMilli();
    }
    // thoi gian bat dau (thgian hien tai )
    public void star() {
        startTime = getCurrentTime();
    }
    // thoi gian ket thuc (thgian hien tai )
    public void end() {
        endTime = getCurrentTime();
    }
    // thoi gian da troi qua ( ket thuc - bat dau )
    public long getElapsedTime(){
        if (endTime==0){
            return 0 ;
        }
        return endTime-startTime ;
    }

}

