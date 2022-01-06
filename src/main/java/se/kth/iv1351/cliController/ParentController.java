package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.ParentMapper;

public class ParentController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public ParentController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void insert(String id) {

    }

    public void delete(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        ParentMapper mapper = sess.getMapper(ParentMapper.class);
        mapper.deleteParent(Integer.parseInt(id));

    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        ParentMapper mapper = sess.getMapper(ParentMapper.class);
        return mapper.selectParent(Integer.parseInt(id));
    }
}