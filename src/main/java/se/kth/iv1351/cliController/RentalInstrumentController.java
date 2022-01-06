package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.RentalInstrumentMapper;

public class RentalInstrumentController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public RentalInstrumentController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void insert(String id) {

    }

    public void delete(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        RentalInstrumentMapper mapper = sess.getMapper(RentalInstrumentMapper.class);
        mapper.deleteRentalInstrument(Integer.parseInt(id));
    }

    public void update(String id) {

    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        RentalInstrumentMapper mapper = sess.getMapper(RentalInstrumentMapper.class);
        return mapper.selectRentalInstrument(Integer.parseInt(id));
    }
}