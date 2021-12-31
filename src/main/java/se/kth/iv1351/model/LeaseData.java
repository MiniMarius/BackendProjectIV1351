package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeaseData {

    private Integer id;

    private String start_time;

    private String end_time;

    private Integer rental_instrument_id;

    private Integer student_id;
}
