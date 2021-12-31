package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserApplicationData {

    private Integer id;

    private String letter;

    private Integer instrument_type_id;

    private Integer user_id;
}