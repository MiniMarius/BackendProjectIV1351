package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeaseData {

    private Integer id;

    private String startTime;

    private String endTime;

    private Integer rentalInstrumentId;

    private Integer studentId;
}
