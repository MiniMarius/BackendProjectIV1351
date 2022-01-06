package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.LeaseMapper;
import se.kth.iv1351.dao.RentalInstrumentMapper;
import se.kth.iv1351.model.LeaseData;
import se.kth.iv1351.model.RentalInstrumentData;
import se.kth.iv1351.util.IdGenerator;

import java.util.List;

public class LeaseController {

    private SqlSessionFactory sqlSessionFactory;

    public LeaseController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<RentalInstrumentData> listRentalInstruments() {
        SqlSession sess = this.sqlSessionFactory.openSession();
        RentalInstrumentMapper mapper = sess.getMapper(RentalInstrumentMapper.class);
        return mapper.selectAllRentalInstruments();
    }

    public LeaseData create(String studentId, String rentalInstrumentId, String startTime, String endTime) {
        Integer newId = IdGenerator.generate();
        LeaseData lease = new LeaseData(newId, startTime, endTime, Integer.parseInt(rentalInstrumentId), Integer.parseInt(studentId));
        SqlSession sess = sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        try {
            mapper.insertLease(lease);
        } catch (Exception e) {
            sess.rollback();
            throw e;
        }
        sess.commit();
        return get(newId);
    }

    public void delete(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        mapper.deleteLease(Integer.parseInt(id));
    }

    public void update(String id) {

    }

    public LeaseData get(Integer id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        return mapper.selectLease(id);
    }
}
