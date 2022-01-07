package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstrumentType implements DataModel {

    private Integer id;

    private String type;

    @Override
    public String toString() {
        return "InstrumentType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
