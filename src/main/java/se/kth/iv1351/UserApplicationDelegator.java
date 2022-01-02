package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.UserApplicationMapper;
import se.kth.iv1351.model.UserApplicationData;
import se.kth.iv1351.openapi.UserapplicationApiDelegate;
import se.kth.iv1351.openapi.model.UserApplication;
import se.kth.iv1351.util.IdGenerator;

@AllArgsConstructor
@Service
public class UserApplicationDelegator implements UserapplicationApiDelegate {
    UserApplicationMapper userApplicationMapper;

    @Override
    public ResponseEntity<UserApplication> userapplicationApplicationidGet(Integer applicationid) {
        UserApplicationData userApplicationData = userApplicationMapper.selectUserApplication(applicationid);
        UserApplication userApplication = new UserApplication();
        userApplication.setId(userApplicationData.getId());
        userApplication.setUserId(userApplicationData.getUserId());
        userApplication.setLetter(userApplicationData.getLetter());
        userApplication.setInstrumentTypeId(userApplicationData.getInstrumentTypeId());
        return new ResponseEntity<UserApplication>(userApplication, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserApplication> userapplicationPost(UserApplication userApplication) {
        Integer id = IdGenerator.generate();
        userApplicationMapper.insertUserApplication(userApplication);
        return userapplicationApplicationidGet(id);
    }
}
