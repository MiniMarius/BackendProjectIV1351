package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.UserPaymentData;
import se.kth.iv1351.openapi.model.UserPayment;

@Mapper
public interface UserPaymentMapper {
    UserPaymentData selectUserPayment(Integer paymentid);
    void insertUserPayment(UserPayment userPayment);
    void deleteUserPayment(Integer paymentid);
    void updateUserPayment(UserPayment userPayment);
}
