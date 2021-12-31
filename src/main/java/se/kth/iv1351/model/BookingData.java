package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingData {

    private Integer id;

    private String start_time;

    private String end_time;

    private Integer lesson_id;

    private Integer student_id;

    private Integer instructor_id;
}
