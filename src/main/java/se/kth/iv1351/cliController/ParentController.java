package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.ParentMapper;

public class ParentController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public ParentController(SqlSessionFactory sqlSessionFactory) {
    }

    public void insert(String id) {

    }

    public void delete(String id) {

    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        ParentMapper mapper = sess.getMapper(ParentMapper.class);
        return mapper.selectParent(Integer.parseInt(id));
    }
}