package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.UserPaymentData;

@Mapper
public interface UserPaymentMapper {
    UserPaymentData selectUserPayment(Integer paymentid);
}
