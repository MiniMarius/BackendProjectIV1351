package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.ReportMapper;

public class ReportController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public ReportController(SqlSessionFactory sqlSessionFactory) {
    }

    public void insert(String id) {

    }

    public void delete(String id) {

    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        ReportMapper mapper = sess.getMapper(ReportMapper.class);
        return mapper.getEnsembleReport();
    }
}