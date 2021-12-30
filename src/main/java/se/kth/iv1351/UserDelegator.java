package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.UserMapper;
import se.kth.iv1351.model.UserData;
import se.kth.iv1351.openapi.UserApiDelegate;
import se.kth.iv1351.openapi.model.User;

@AllArgsConstructor
@Service
public class UserDelegator implements UserApiDelegate {
    private UserMapper userMapper;

    @Override
    public ResponseEntity<User> userGet() {
        UserData userData = userMapper.selectUser();
        User user  = new User();
        user.setName("Fisen");
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
