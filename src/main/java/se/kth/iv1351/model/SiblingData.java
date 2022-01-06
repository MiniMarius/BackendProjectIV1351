package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SiblingData implements DataModel {

    private Integer studentIdOne;

    private Integer studentIdTwo;

    @Override
    public String toString() {
        return "SiblingData{" +
                "studentIdOne=" + studentIdOne +
                ", studentIdTwo=" + studentIdTwo +
                '}';
    }
}
