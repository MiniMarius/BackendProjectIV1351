package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.UserPaymentData;

@Mapper
public interface UserPaymentMapper {
    UserPaymentData selectUserPayment(Integer paymentid);
    void insertUserPayment(UserPaymentData userPayment);
    void deleteUserPayment(Integer paymentid);
    void updateUserPayment(UserPaymentData userPayment);
}
