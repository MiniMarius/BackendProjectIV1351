package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParentData {

    private Integer studentId;

    private Integer parentId;

    @Override
    public String toString() {
        return "ParentData{" +
                "studentId=" + studentId +
                ", parentId=" + parentId +
                '}';
    }
}
