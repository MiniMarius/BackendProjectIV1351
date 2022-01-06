package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.InstrumentTypeMapper;

public class InstrumentTypeController  {
    private SqlSessionFactory sqlSessionFactory;

    public InstrumentTypeController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void insert(String id) {

    }

    public void delete(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        InstrumentTypeMapper mapper = sess.getMapper(InstrumentTypeMapper.class);
        mapper.deleteInstrumentType(Integer.parseInt(id));
    }
    public void update(String id) {

    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        InstrumentTypeMapper mapper = sess.getMapper(InstrumentTypeMapper.class);
        return mapper.selectInstrumentType(Integer.parseInt(id));
    }
}