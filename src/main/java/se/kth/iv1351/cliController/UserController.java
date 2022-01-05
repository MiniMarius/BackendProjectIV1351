package se.kth.iv1351.cliController;

import lombok.AllArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.UserMapper;
import se.kth.iv1351.model.UserData;

import java.util.List;

public class UserController {

    SqlSessionFactory sqlSessionFactory;

    public UserController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void createUser(String param) {

    }
    public void deleteUser(String param) {

    }
    public void getALlUsers() {

    }

    public List<UserData> getAllUsers() {
        SqlSession sess = this.sqlSessionFactory.openSession();
        UserMapper usermapper = sess.getMapper(UserMapper.class);
        return usermapper.selectAllUsers();
    }
}
