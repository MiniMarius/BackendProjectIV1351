package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserApplication implements DataModel {

    private Integer id;

    private String letter;

    private Integer instrumentTypeId;

    private Integer userId;

    @Override
    public String toString() {
        return "UserApplication{" +
                "id=" + id +
                ", letter='" + letter + '\'' +
                ", instrumentTypeId=" + instrumentTypeId +
                ", userId=" + userId +
                '}';
    }
}