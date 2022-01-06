package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.UserInstrumentMapper;

public class UserInstrumentController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public UserInstrumentController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void insert(String id) {

    }

    public void delete(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        UserInstrumentMapper mapper = sess.getMapper(UserInstrumentMapper.class);
        mapper.deleteUserInstrument(Integer.parseInt(id));
    }

    public void update(String id) {

    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        UserInstrumentMapper mapper = sess.getMapper(UserInstrumentMapper.class);
        return mapper.selectUserInstrument(Integer.parseInt(id));
    }
}