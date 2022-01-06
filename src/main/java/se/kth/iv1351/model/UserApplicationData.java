package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserApplicationData  implements DataModel {

    private Integer id;

    private String letter;

    private Integer instrumentTypeId;

    private Integer userId;

    @Override
    public String toString() {
        return "UserApplicationData{" +
                "id=" + id +
                ", letter='" + letter + '\'' +
                ", instrumentTypeId=" + instrumentTypeId +
                ", userId=" + userId +
                '}';
    }
}