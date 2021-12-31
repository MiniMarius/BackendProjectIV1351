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
}
