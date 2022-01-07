package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInstrument implements DataModel {

    private Integer userid;

    private Integer instrumentTypeId;

    @Override
    public String toString() {
        return "UserInstrument{" +
                "userid=" + userid +
                ", instrumentTypeId=" + instrumentTypeId +
                '}';
    }
}
