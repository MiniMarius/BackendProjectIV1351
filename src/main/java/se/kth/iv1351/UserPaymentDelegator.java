package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.UserPaymentMapper;
import se.kth.iv1351.model.UserPaymentData;
import se.kth.iv1351.openapi.UserpaymentApiDelegate;
import se.kth.iv1351.openapi.model.UserPayment;
import se.kth.iv1351.util.IdGenerator;

@AllArgsConstructor
@Service
public class UserPaymentDelegator implements UserpaymentApiDelegate {
    UserPaymentMapper userPaymentMapper;

    @Override
    public ResponseEntity<UserPayment> userpaymentPaymentidGet(Integer paymentid) {
        UserPaymentData userPaymentData = userPaymentMapper.selectUserPayment(paymentid);
        UserPayment userPayment = new UserPayment();
        userPayment.setId(userPaymentData.getId());
        userPayment.setUserid(userPaymentData.getUserid());
        userPayment.setAmount(userPaymentData.getAmount());
        userPayment.setCurrency(userPaymentData.getCurrency());
        userPayment.setType(userPaymentData.getType());
        return new ResponseEntity<UserPayment>(userPayment, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserPayment> userpaymentPost(UserPayment userPayment) {
        Integer id = IdGenerator.generate();
        userPaymentMapper.insertUserPayment(userPayment);
        return userpaymentPaymentidGet(id);
    }
}
