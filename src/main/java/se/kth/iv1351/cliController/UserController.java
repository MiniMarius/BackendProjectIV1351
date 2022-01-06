package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.UserMapper;
import se.kth.iv1351.model.UserData;

public class UserController implements Controller {

    SqlSessionFactory sqlSessionFactory;

    public UserController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    public UserData get(String userid) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        UserMapper usermapper = sess.getMapper(UserMapper.class);
        return usermapper.selectUser(Integer.parseInt(userid));
    }

    public void insert(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        UserMapper usermapper = sess.getMapper(UserMapper.class);
    }

    public void delete(String param) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        UserMapper usermapper = sess.getMapper(UserMapper.class);
        usermapper.deleteUser(Integer.parseInt(param));
    }

    public void update(String id) {

    }
}
