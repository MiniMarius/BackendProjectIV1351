package se.kth.iv1351.restAppController;

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
        userPayment.setUserid(userPaymentData.getUserid());
        return new ResponseEntity<UserPayment>(userPayment, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> userpaymentPaymentidDelete(Integer paymentid) {
        userPaymentMapper.deleteUserPayment(paymentid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserPayment> userpaymentPaymentidPut(Integer paymentid, UserPayment userPayment) {
       userPaymentMapper.updateUserPayment(userPayment);
       return userpaymentPaymentidGet(paymentid);
    }
}
