package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sibling implements DataModel {

    private Integer studentIdOne;

    private Integer studentIdTwo;

    @Override
    public String toString() {
        return "Sibling{" +
                "studentIdOne=" + studentIdOne +
                ", studentIdTwo=" + studentIdTwo +
                '}';
    }
}
