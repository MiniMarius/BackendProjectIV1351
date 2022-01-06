package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingData {

    private Integer id;

    private String startTime;

    private String endTime;

    private Integer lessonId;

    private Integer studentId;

    private Integer instructorId;

    @Override
    public String toString() {
        return "BookingData{" +
                "id=" + id +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", lessonId=" + lessonId +
                ", studentId=" + studentId +
                ", instructorId=" + instructorId +
                '}';
    }
}
