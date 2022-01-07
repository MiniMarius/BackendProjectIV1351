package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parent implements DataModel {

    private Integer studentId;

    private Integer parentId;

    @Override
    public String toString() {
        return "Parent{" +
                "studentId=" + studentId +
                ", parentId=" + parentId +
                '}';
    }
}
