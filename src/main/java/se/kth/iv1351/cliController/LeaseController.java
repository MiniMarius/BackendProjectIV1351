package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.LeaseMapper;
import se.kth.iv1351.dao.RentalInstrumentMapper;
import se.kth.iv1351.model.LeaseData;
import se.kth.iv1351.model.RentalInstrumentData;
import se.kth.iv1351.util.IdGenerator;
import se.kth.iv1351.util.TimestampGenerator;

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

    public LeaseData create(String studentId, String rentalInstrumentId, String startTime, String endTime) throws Exception {
        Integer newId = IdGenerator.generate();
        LeaseData lease = new LeaseData(newId, startTime, endTime, Integer.parseInt(rentalInstrumentId), Integer.parseInt(studentId));
        SqlSession sess = sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        try {
            LeaseData activeLease = mapper.selectActiveLeaseStudent(Integer.parseInt(studentId));
            if (activeLease != null) {
                throw new Exception(String.format("Student already has an active instrument rental %s", activeLease.getId()));
            }
            mapper.insertLease(lease);
        } catch (Exception e) {
            sess.rollback();
            throw e;
        }
        sess.commit();
        return get(newId);
    }

    public LeaseData terminateLease(String id) throws Exception {
        SqlSession sess = this.sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        LeaseData lease = mapper.selectLease(Integer.parseInt(id));
        String newEndTime = TimestampGenerator.generate();
        return update(lease.getId().toString(), lease.getStudentId().toString(), lease.getRentalInstrumentId().toString(), lease.getStartTime().toString(), newEndTime);
    }

    public LeaseData update(String id, String studentId, String rentalInstrumentId, String startTime, String endTime) throws Exception {
        SqlSession sess = sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        try {
            LeaseData lease = mapper.selectLease(Integer.parseInt(id));
            lease.setStartTime(startTime);
            lease.setEndTime(endTime);
            lease.setStudentId(Integer.parseInt(studentId));
            lease.setRentalInstrumentId(Integer.parseInt(rentalInstrumentId));
            mapper.updateLease(lease);
        } catch (Exception e) {
            sess.rollback();
            throw e;
        }
        sess.commit();
        return get(Integer.parseInt(id));
    }

    public LeaseData get(Integer id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        return mapper.selectLease(id);
    }
}
