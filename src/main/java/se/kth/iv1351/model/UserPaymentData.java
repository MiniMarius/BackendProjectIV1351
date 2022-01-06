package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserPaymentData {

    private Integer id;

    private String type;

    private Integer amount;

    private String currency;

    private Integer userid;

    @Override
    public String toString() {
        return "UserPaymentData{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", userid=" + userid +
                '}';
    }
}
