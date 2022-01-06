package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SiblingData {

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
