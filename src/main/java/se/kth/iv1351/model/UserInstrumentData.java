package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInstrumentData implements DataModel {

    private Integer userid;

    private Integer instrumentTypeId;

    @Override
    public String toString() {
        return "UserInstrumentData{" +
                "userid=" + userid +
                ", instrumentTypeId=" + instrumentTypeId +
                '}';
    }
}
