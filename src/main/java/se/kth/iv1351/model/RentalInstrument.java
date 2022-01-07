package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RentalInstrument implements DataModel {

    private Integer id;

    private String description;

    private String serialNumber;

    private Integer instrumentTypeId;

    @Override
    public String toString() {
        return "RentalInstrument{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", instrumentTypeId=" + instrumentTypeId +
                '}';
    }
}
