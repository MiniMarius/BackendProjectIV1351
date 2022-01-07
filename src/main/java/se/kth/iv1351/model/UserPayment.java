package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserPayment implements DataModel {

    private Integer id;

    private String type;

    private Integer amount;

    private String currency;

    private Integer userid;

    @Override
    public String toString() {
        return "UserPayment{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", userid=" + userid +
                '}';
    }
}
