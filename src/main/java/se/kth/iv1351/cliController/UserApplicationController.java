package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.UserApplicationMapper;

public class UserApplicationController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public UserApplicationController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void insert(String id) {

    }

    public void delete(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        UserApplicationMapper mapper = sess.getMapper(UserApplicationMapper.class);
        mapper.deleteUserApplication(Integer.parseInt(id));
    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        UserApplicationMapper mapper = sess.getMapper(UserApplicationMapper.class);
        return mapper.selectUserApplication(Integer.parseInt(id));
    }
}