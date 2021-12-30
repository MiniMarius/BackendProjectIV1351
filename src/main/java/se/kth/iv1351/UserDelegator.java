package se.kth.iv1351;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import se.kth.iv1351.openapi.UserApiDelegate;
import se.kth.iv1351.openapi.model.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@Service
public class UserDelegator implements UserApiDelegate {
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<User> userGet() {
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT count(1) FROM users");
            ResultSet res = stmt.executeQuery();

            User user = new User();
            user.setName("Fisen");
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
