package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.UserInstrumentMapper;
import se.kth.iv1351.model.UserInstrumentData;
import se.kth.iv1351.openapi.UserinstrumentApiDelegate;
import se.kth.iv1351.openapi.model.UserInstrument;

@AllArgsConstructor
@Service
public class UserInstrumentDelegator implements UserinstrumentApiDelegate {
    UserInstrumentMapper userInstrumentMapper;

    @Override
    public ResponseEntity<UserInstrument> userinstrumentInstrumentidGet(Integer instrumentid) {
        UserInstrumentData userInstrumentData = userInstrumentMapper.selectUserInstrument(instrumentid);
        UserInstrument userInstrument = new UserInstrument();
        userInstrument.setInstrumentTypeId(userInstrumentData.getInstrumentTypeId());
        userInstrument.setId(userInstrumentData.getUserid());
        return new ResponseEntity<UserInstrument>(userInstrument, HttpStatus.OK);
    }
}
