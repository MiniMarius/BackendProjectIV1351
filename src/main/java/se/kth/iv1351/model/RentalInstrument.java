package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RentalInstrument implements DataModel {

    private Integer id;

    private String description;

    private String serialNumber;

    private String brand;

    private Integer instrumentTypeId;

    private Integer price;

    private String currency;

    @Override
    public String toString() {
        return "RentalInstrument{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", price='" + price + '\'' +
                ", currency='" + currency + '\'' +
                ", instrumentTypeId=" + instrumentTypeId +
                '}';
    }
}
