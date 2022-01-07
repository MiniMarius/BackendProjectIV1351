package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User implements DataModel {

    private Integer id;

    private String personNumber;

    private String name;

    private Integer age;

    private String address;

    private String email;

    private String phoneNumber;

    private String role;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", personNumber='" + personNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
