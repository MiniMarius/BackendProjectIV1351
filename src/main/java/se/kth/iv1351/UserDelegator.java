package se.kth.iv1351;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import se.kth.iv1351.openapi.UserApiDelegate;
import se.kth.iv1351.openapi.model.User;

@Service
public class UserDelegator implements UserApiDelegate {
    @Override
    public ResponseEntity<User> userGet() {
        User user = new User();
        user.setName("Fisen");
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
