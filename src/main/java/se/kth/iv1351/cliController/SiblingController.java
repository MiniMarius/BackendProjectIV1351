package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.SiblingMapper;

public class SiblingController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public SiblingController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void insert(String id) {

    }

    public void delete(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        SiblingMapper mapper = sess.getMapper(SiblingMapper.class);
        mapper.deleteSibling(Integer.parseInt(id));
    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        SiblingMapper mapper = sess.getMapper(SiblingMapper.class);
        return mapper.selectSibling(Integer.parseInt(id));
    }
}