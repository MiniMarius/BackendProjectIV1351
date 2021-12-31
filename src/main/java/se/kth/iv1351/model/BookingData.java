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
}
