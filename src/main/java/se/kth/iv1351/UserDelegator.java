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
    public ResponseEntity<User> userUseridGet(Integer userid) {
        UserData userData = userMapper.selectUser(userid);
        User user  = new User();
        user.setId(userData.getId());
        user.setName(userData.getName());
        user.setAge(userData.getAge());
        user.setPersonNumber(userData.getPersonNumber());
        user.setEmail(userData.getEmail());
        user.setAddress(userData.getAddress());
        user.setPhoneNumber(userData.getPhoneNumber());
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> userPost(User user) {
        userMapper.insertUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
