package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.UserInstrumentMapper;
import se.kth.iv1351.model.UserInstrumentData;
import se.kth.iv1351.openapi.UserinstrumentApiDelegate;
import se.kth.iv1351.openapi.model.UserInstrument;
import se.kth.iv1351.util.IdGenerator;

@AllArgsConstructor
@Service
public class UserInstrumentDelegator implements UserinstrumentApiDelegate {
    UserInstrumentMapper userInstrumentMapper;

    @Override
    public ResponseEntity<UserInstrument> userinstrumentInstrumentidGet(Integer instrumentid) {
        UserInstrumentData userInstrumentData = userInstrumentMapper.selectUserInstrument(instrumentid);
        UserInstrument userInstrument = new UserInstrument();
        userInstrument.setInstrumentTypeId(userInstrumentData.getInstrumentTypeId());
        userInstrument.setUserId(userInstrumentData.getUserid());
        return new ResponseEntity<UserInstrument>(userInstrument, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserInstrument> userinstrumentPost(UserInstrument userInstrument) {
        userInstrumentMapper.insertUserInstrument(userInstrument);
        return userinstrumentInstrumentidGet(userInstrument.getUserId());
    }
}
