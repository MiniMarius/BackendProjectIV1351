package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.LeaseMapper;

public class LeaseController implements Controller {

    private SqlSessionFactory sqlSessionFactory;
    public LeaseController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void insert(String id) {

    }

    public void delete(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        mapper.deleteLease(Integer.parseInt(id));
    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        return mapper.selectLease(Integer.parseInt(id));
    }
}
