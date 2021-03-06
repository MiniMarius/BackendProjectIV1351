package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Lease implements DataModel {

    private Integer id;

    private String startTime;

    private String endTime;

    private Integer rentalInstrumentId;

    private Integer studentId;

    @Override
    public String toString() {
        return "Lease{" +
                "id=" + id +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", rentalInstrumentId=" + rentalInstrumentId +
                ", studentId=" + studentId +
                '}';
    }
}
