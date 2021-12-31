package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RentalInstrumentData {

    private Integer id;

    private String description;

    private String serial_number;

    private Integer instrument_type_id;
}
