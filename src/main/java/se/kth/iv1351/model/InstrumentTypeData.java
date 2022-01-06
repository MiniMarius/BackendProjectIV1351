package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstrumentTypeData {

    private Integer id;

    private String type;

    @Override
    public String toString() {
        return "InstrumentTypeData{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
